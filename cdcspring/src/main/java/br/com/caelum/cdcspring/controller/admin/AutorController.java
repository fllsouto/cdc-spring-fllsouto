package br.com.caelum.cdcspring.controller.admin;

import br.com.caelum.cdcspring.model.Autor;
import br.com.caelum.cdcspring.model.form.AutorForm;
import br.com.caelum.cdcspring.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/admin/autor")
public class AutorController {

    @Autowired
    private AutorRepository autorRepository;

    @GetMapping
    public ModelAndView autor() {
        ModelAndView mv = new ModelAndView("admin/autor/autor");
        return mv;
    }

    @GetMapping("/autores")
    public ModelAndView autores() {
        ModelAndView mv = new ModelAndView("admin/autor/autores");
        List<Autor> autores = autorRepository.findAll();
        mv.addObject("autores", autores);
        return mv;
    }

    @GetMapping("/form")
    public ModelAndView form(AutorForm form) {
        ModelAndView mv = new ModelAndView("admin/autor/form");
        mv.addObject("form", form);
        return mv;
    }

    @PostMapping("/form")
    public ModelAndView submit(@Valid AutorForm form, BindingResult result) {
        if (result.hasErrors()) return form(form);

        Autor autor = form.toAutor();
        autorRepository.save(autor);

        return new ModelAndView("redirect:/admin/autor");
    }
}
