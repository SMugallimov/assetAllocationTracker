package com.assets.assetAllocationTracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/asset-allocation-tracker/sign-in/")
    public String signInPage (Model model){
        model.addAttribute("title", "Sign In");
        return "signInPage";
    }
}