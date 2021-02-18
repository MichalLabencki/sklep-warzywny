package com.example.sklepwarzywny.registration;

import com.example.sklepwarzywny.user.UserForm;
import com.example.sklepwarzywny.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {
    private UserService userService;

    @Autowired
    public RegistrationController(UserService userService) {
        this.userService = userService;

    }

    @GetMapping("/registration")
    public ModelAndView registration(Model model) {
        model.addAttribute("userForm", new UserForm());
        return new ModelAndView("registration");
    }

    @PostMapping("registration")
    public ModelAndView register(@RequestParam String login, @RequestParam String password, @RequestParam String passwordConfirmation, Model model) {
        model.addAttribute("userForm", new UserForm());
        userService.createUser(login, password);
        return new ModelAndView("registration");



        // redirect do zrobienia na login


    }
}
