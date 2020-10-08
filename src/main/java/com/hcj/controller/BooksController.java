package com.hcj.controller;

import com.hcj.pojo.Books;
import com.hcj.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BooksController {

    @Autowired
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @RequestMapping("/allbook")
    public String queryAllBoook(Model model){
        List<Books> books = userService.queryAllBook();
        model.addAttribute("books", books);

        return "allbook";
    }


}
