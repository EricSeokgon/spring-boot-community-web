package com.tistory.hadeslee.springbootcommunityweb.controller;

import com.tistory.hadeslee.springbootcommunityweb.annotation.SocialUser;
import com.tistory.hadeslee.springbootcommunityweb.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by KimYJ on 2017-09-13.
 */
@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/loginSuccess")
    public String loginComplete() {
        return "redirect:/board/list";
    }
}

