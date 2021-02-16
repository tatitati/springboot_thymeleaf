package com.example.demo

import org.springframework.validation.BindingResult

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping


@Controller
class UserController {
    @GetMapping("/endpoint1")
    fun showSignUpForm(): String {
        return "template1" // this point to templates/template1.html
    }

    @GetMapping("/endpoint2")
    fun addUser(model: Model): String {
        model.addAttribute("email", "myemail@asdfadsf");
        return "template2"
    }
}
