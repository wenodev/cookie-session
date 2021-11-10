package com.example.cose.token;

public class JwtToken {
    private String value;
    private String expired;

    public JwtToken(String value, String expired) {
        this.value = value;
        this.expired = expired;
    }

    @Override
    public String toString() {
        return "JwtToken{" +
                "value='" + value + '\'' +
                ", expired='" + expired + '\'' +
                '}';
    }
}
