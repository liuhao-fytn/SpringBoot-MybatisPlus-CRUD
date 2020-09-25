package com.study.crud.controller;

import com.study.crud.model.User;
import com.study.crud.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/list")
    public List<User> list() {

        return userService.list();
    }

    @PostMapping("/insert")
    public User insert() {
        User user = new User();
        user.setId(666666L);
        user.setName("张三");
        user.setAge(33);
        user.setEmail("666666@hotmail.com");
        return user;
    }

    @DeleteMapping("/remove/{id}")
    public User remove(@PathVariable("id") Long id) {
        User user = new User();
        userService.removeById(1);
        return user;
    }

    @PutMapping("/update")
    public User update() {
        User user = new User();
        user.setId(666666L);
        user.setName("李四");
        user.setAge(44);
        user.setEmail("7777777@gmail.com");
        return user;
    }

    @GetMapping("/select/{id}")
    public User select(@PathVariable("id") Long id) {
        User user = new User();
        userService.getById(2);
        return userService.getById(2);
    }

}
