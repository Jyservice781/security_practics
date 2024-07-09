package com.movie_security.Demo_security.controller;

import com.movie_security.Demo_security.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board/")
public class BoardController {
    private final BoardService boardService;

    @GetMapping("showAll")
    public String showList() {
        return "board/showAll";
    }




}
