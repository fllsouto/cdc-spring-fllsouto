package br.com.caelum.cdcspring.controller.admin;

import br.com.caelum.cdcspring.model.form.AutorForm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/admin/autor")
public class AutorController {

    @GetMapping
    public ModelAndView autor() {
        return new ModelAndView("admin/autor/autor");
    }

    @GetMapping("/form")
    public ModelAndView form() {
        return new ModelAndView("admin/autor/form");
    }

    @PostMapping("/form")
    public ModelAndView submit(@Valid AutorForm form, BindingResult result) {
        if (result.hasErrors()) {
            System.out.println("Tem erros aqui!");
        } else {
            System.out.println("Não tem erros!");
        }
        System.out.println(form);
        System.out.println("POST MAPPING!");
        return autor();
    }
}
