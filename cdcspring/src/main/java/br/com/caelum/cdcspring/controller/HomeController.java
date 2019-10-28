package br.com.caelum.cdcspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView mv  = new ModelAndView("home");
        System.out.println("Entrei aqui");
        return mv;
    }
}
