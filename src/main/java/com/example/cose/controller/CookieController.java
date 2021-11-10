package com.example.cose.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
public class CookieController {

    @GetMapping("/cookie")
    public ResponseEntity setCookie(HttpServletResponse response){
        Cookie cookie = new Cookie("name","weno");
        cookie.setComment("test-comment");
        cookie.setMaxAge(7 * 24 * 60 * 60);
        cookie.setHttpOnly(true);
        response.addCookie(cookie);
        String jwtToken = "JWT_TOKEN";
        return new ResponseEntity(jwtToken, HttpStatus.OK);
    }

}
