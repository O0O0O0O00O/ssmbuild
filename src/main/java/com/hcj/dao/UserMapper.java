package com.hcj.dao;

import com.hcj.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    //增加一本书
    public int addBook(Books books);

    //删除一本书
    public int deleteBookById(@Param("bookID") int id);

    //更新一本书
    public int updateBook(Books books);

    //查询一本书
    public Books queryBookById(@Param("bookID") int id);

    //查询所有书
    public List<Books> queryAllBook();

}
