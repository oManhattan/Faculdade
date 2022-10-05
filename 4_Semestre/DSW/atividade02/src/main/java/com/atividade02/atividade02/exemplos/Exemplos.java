package com.atividade02.atividade02.exemplos;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exemplos")
public class Exemplos {
    
    @GetMapping
    public String getExemplo01() {
        return "exemplo01";
    }
    

    @GetMapping("/exemplo02")
    public String getExemplo02(Model model) {
        
        model.addAttribute("titulo", "Título exemplo 2");
        model.addAttribute("data", LocalDateTime.now());

        return "exemplo02";
    }
    
    
}
