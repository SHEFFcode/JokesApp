package com.sheffmachine.jokes.controllers;

import com.sheffmachine.jokes.services.ChuckNorrisJokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private ChuckNorrisJokeService chuckNorrisJokeService;

    @Autowired
    public JokesController(ChuckNorrisJokeService chuckNorrisJokeService) {
        this.chuckNorrisJokeService = chuckNorrisJokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model) {
        model.addAttribute("joke", chuckNorrisJokeService.getJoke());
        return "chucknorris";
    }
}
