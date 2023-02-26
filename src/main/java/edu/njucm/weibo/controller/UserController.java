package edu.njucm.weibo.controller;

import edu.njucm.weibo.pojo.User;
import edu.njucm.weibo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Scope("prototype")
@RequestMapping("/test")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/selectAll")
    public List<User> selectAll() throws Exception {
        return userService.selectAll();
    }

    @GetMapping(value = "/selectById")
    public User selectById(int id) throws Exception {
        return userService.selectById(id);
    }
}
