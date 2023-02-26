package edu.njucm.weibo.service;

import edu.njucm.weibo.mapper.UserMapper;
import edu.njucm.weibo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> selectAll() {
        return userMapper.selectAll();
    }

    public User selectById(int id) {
        return userMapper.selectById(id);
    }
}
