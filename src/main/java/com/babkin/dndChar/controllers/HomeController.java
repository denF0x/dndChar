package com.babkin.dndChar.controllers;

import com.babkin.dndChar.models.User;
import com.babkin.dndChar.transfers.UserDto;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping
    public String showTime(Model model,
                           @AuthenticationPrincipal User user) {

        if (user != null) {
            UserDto userDto = UserDto.from(user);
            model.addAttribute("user", userDto);
        }

        return "home";
    }
}
