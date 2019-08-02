package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "")
public class IndexController {

    @GetMapping(value = "")
    public String getIndex(Model model) {
        model.addAttribute("title", "This is a title");
        return "index";
    }
}
