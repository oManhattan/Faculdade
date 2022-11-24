package com.trabalho_individual.trabalho_individual.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PaginasController {
    
    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView model = new ModelAndView("index");

        return model;
    }

    @GetMapping("/new-music")
    public ModelAndView novaMusica() {
        ModelAndView model = new ModelAndView("new_music");
        return model;
    }
    
}
