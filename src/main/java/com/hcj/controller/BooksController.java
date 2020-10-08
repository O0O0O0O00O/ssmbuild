package com.hcj.controller;

import com.hcj.pojo.Books;
import com.hcj.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.jws.WebParam;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BooksController {

    @Autowired
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @RequestMapping("/allBook")
    public String queryAllBoook(Model model){
        List<Books> books = userService.queryAllBook();
        model.addAttribute("books", books);

        return "allbook";
    }

    //跳转添加书籍页面
    @RequestMapping("/toAddPage")
    public String toAddPage(){
        return "addBook";
    }

    //添加数据的请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addbooks->" + books);
        userService.addBook(books);

        return "redirect:/book/allBook"; //重定向到我们的请求
    }

    @RequestMapping("/toUpdatePage")
    public String toUpdatePage(int id, Model model){
        Books books = userService.queryBookById(id);
        model.addAttribute("Qbooks", books);

        return "updatePage";
    }

    @RequestMapping("/updateBook")
    public String UpdateBook(Books books){
        userService.updateBook(books);
        return "redirect:/book/allBook";
    }

    @RequestMapping("/deleteBook")
    public String DeleteBook(int id){
        userService.deleteBookById(id);
        return "redirect:/book/allBook";
    }


}
