package com.cg.Assignment2.Controller;

import com.cg.Assignment2.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @GetMapping("/")
    public String showPage1() {
        return "page1";
    }

    @PostMapping("/page2")
    public String processPage1(@RequestParam String firstName,
                               @RequestParam String lastName,
                               Model model) {
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        return "page2";
    }

    @PostMapping("/page3")
    public String processPage2(@RequestParam String firstName,
                               @RequestParam String lastName,
                               @RequestParam String email,
                               @RequestParam String phone,
                               Model model) {
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        model.addAttribute("email", email);
        model.addAttribute("phone", phone);
        return "page3";
    }

    @PostMapping("/page4")
    public String processPage3(@RequestParam String firstName,
                               @RequestParam String lastName,
                               @RequestParam String email,
                               @RequestParam String phone,
                               @RequestParam String city,
                               @RequestParam String country,
                               Model model) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setEmail(email);
        user.setPhone(phone);
        user.setCity(city);
        user.setCountry(country);
        model.addAttribute("user", user);
        return "page4";
    }
}

