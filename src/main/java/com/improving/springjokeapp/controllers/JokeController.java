package com.improving.springjokeapp.controllers;

import com.improving.springjokeapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String getJokeFromService(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";

    }
}
