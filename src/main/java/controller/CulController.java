package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CulController {
    @GetMapping(value = "/")
    public String index() {
        return "index";
    }

    @PostMapping(value = "/cul")
    public String Cul(@RequestParam double b, Model model) {
        double a = b * 22000;
        model.addAttribute("rs", a);
        return "result";
    }
}