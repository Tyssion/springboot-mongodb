package com.qing.controller;

import com.qing.entity.User;
import com.qing.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: zhching
 * @Date: 2019/7/2 10:58
 * @Version 1.0
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user")
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable("id")String id){
        return userRepository.findById(id).get();
    }

    @PostMapping("/user")
    public User save(User user){
        return userRepository.save(user);
    }

    @PutMapping("/user")
    public User update(User user){
        return userRepository.save(user);
    }

    @DeleteMapping("/user/{id}")
    public void deleteById(@PathVariable("id")String id){
        userRepository.deleteById(id);
    }
}
