package com.hcj.service;

import com.hcj.dao.UserMapper;
import com.hcj.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


public class UserServiceImpl implements UserService{

    private UserMapper userMapper;

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public int addBook(Books books) {
        return userMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return userMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return userMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return userMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return userMapper.queryAllBook();
    }
}
