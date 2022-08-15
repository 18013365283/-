package com.lyf.service;

import com.lyf.pojo.User;
import org.junit.Before;
import org.junit.Test;

public class UserServiceTest {
    private UserService userService=null;


    @Before
    public void init(){
        System.out.println("测试方法执行前执行.......");
        userService=new UserService();
    }

    @Test
    public void addUser(){
        userService.addUser(new User(3,"admin","123456","admin","",""));
    }

    @Test
    public void listUser(){
        userService.listUser();
    }



    @Test
    public void testLogin(){
        userService.login("admin","123456");
    }

    @Test
    public void updateUser(){
        userService.updateUser(new User(2,"test","123456","test","test",""));
        userService.listUser();
    }


    @Test
    public void delUser(){

    }

}
