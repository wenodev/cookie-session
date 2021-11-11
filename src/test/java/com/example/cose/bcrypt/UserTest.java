package com.example.cose.bcrypt;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {

    private User user1;
    private User user2;
    private PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @BeforeEach
    void setUp(){
        user1 = new User("abc1@abc.com", passwordEncoder.encode("q1w2e3r4r"));
        user2 = new User("abc2@abc.com", passwordEncoder.encode("q1w2e3r4r"));
    }

    @Test
    void test_is_same_encode_password_1(){
        assertThat(passwordEncoder.matches("q1w2e3r4r", user1.getPassword())).isTrue();
        assertThat(passwordEncoder.matches("q1w2e3r4r", user2.getPassword())).isTrue();
    }

    @Test
    void test_is_same_encode_password_2(){
        assertThat(user1.getPassword().equals(user2.getPassword())).isFalse();
    }

}

