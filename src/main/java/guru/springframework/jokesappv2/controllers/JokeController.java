package guru.springframework.jokesappv2.controllers;

import guru.springframework.jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private final JokeService service;

    public JokeController(JokeService service) {
        this.service = service;
    }

    @RequestMapping({"/", })
    public String showJoke(Model model){
        model.addAttribute("joke", service.getJoke());
        return "index";
    }
}
