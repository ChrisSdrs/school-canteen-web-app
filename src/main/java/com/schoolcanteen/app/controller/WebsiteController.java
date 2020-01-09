package com.schoolcanteen.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebsiteController {

    @GetMapping(value = "/website")
    public String repairs(Model model) {
        return "index";
    }
}
