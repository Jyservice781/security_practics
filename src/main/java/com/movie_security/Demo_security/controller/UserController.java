package com.movie_security.Demo_security.controller;


import com.movie_security.Demo_security.model.UserDTO;
import com.movie_security.Demo_security.service.UserService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @PostMapping("auth")
    public String auth(UserDTO userDTO, HttpSession session){
        UserDTO result = userService.auth(userDTO);

        if(result != null){
            session.setAttribute("logIn", result);
            return "redirect:/board/showAll";
        }
        return "redirect:/";
    }

    @GetMapping("register")
    public String showRegister(){
        return "user/register";
    }

    @PostMapping("register")
    public String register(UserDTO userDTO){
        if(userService.validateUsername(userDTO.getUsername())){
            userDTO.setPassword(encoder.encode(userDTO.getPassword()));
            userService.register(userDTO);
        }
        return "redirect:/";
    }


}
