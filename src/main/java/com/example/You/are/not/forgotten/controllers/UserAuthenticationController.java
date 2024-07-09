package com.example.You.are.not.forgotten.controllers;

import com.example.You.are.not.forgotten.entities.dto.UserRegistrationModel;
import com.example.You.are.not.forgotten.services.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserAuthenticationController {

    private final UserService userService;

    public UserAuthenticationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/signup")
    public ModelAndView register(@ModelAttribute("userRegistrationModel") UserRegistrationModel userRegistrationModel){
        return new ModelAndView("login");
    }

    @PostMapping("/signup")
    public ModelAndView register(@ModelAttribute("userRegistrationModel") @Valid UserRegistrationModel userRegistrationModel,
                                 BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            ModelAndView modelAndView = new ModelAndView("login");
        }
        if(userService.isEmailTaken(userRegistrationModel.getEmail())){
            bindingResult.rejectValue("email", "error.userRegistrationModel", "Е-mail is already taken");
            return new ModelAndView("login");
        }
        if (!userRegistrationModel.getPassword().equals(userRegistrationModel.getConfirmPassword())) {
            bindingResult.rejectValue("confirmPassword", "error.userRegistrationModel", "Passwords do not match.");
            return new ModelAndView("login");
        }

        userService.register(userRegistrationModel);
        return  new ModelAndView("redirect:/index");

    }
}
