package com.trabalho_individual.trabalho_individual.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PaginasController {
    
    @GetMapping("/")
    public ModelAndView homePage() {
        return new ModelAndView("index");
    }

    @GetMapping("/music/list")
    public ModelAndView musicListPage() {
        ModelAndView model = new ModelAndView("music_list");
        return model;
    }

    @GetMapping("/music/new")
    public ModelAndView newMusicPage() {
        ModelAndView model = new ModelAndView("new_music");
        return model;
    }
    
}
