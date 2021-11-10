package com.example.cose.controller;

import com.example.cose.token.JwtToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class SessionController {

    @GetMapping("/session")
    public String setSession(HttpSession session){
        session.setAttribute("accessToken", new JwtToken("qweasdzxc", "2021-11-05"));
        return "session ok";
    }

    @GetMapping("/session/check")
    public String checkSession(HttpServletRequest req){
        HttpSession session = req.getSession();
        return String.valueOf(session.getAttribute("accessToken"));
    }
}
