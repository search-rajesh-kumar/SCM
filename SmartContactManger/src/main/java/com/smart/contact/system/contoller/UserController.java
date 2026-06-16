package com.smart.contact.system.contoller;

import com.smart.contact.system.model.User;
import com.smart.contact.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/createAndUpdateUser")
    private User  createAndUpdateUser(@RequestBody User user){
        return userService.createAndUpdateUser(user);
    }

    @GetMapping("/findAllUsers")
    private List<User> findAllUser(){
        return userService.findAllUser();
    }

    @GetMapping("/findUserById/{userId}")
    private Optional<User> findUserById(@PathVariable int userId){
        return userService.findUserById(userId);
    }

    @DeleteMapping("/deleteUserById/{userId}")
    private Optional<User> deleteUserById(@PathVariable int userId){
        Optional<User> findUserById = userService.findUserById(userId);
        if(findUserById.isPresent()){
            userService.deleteUserById(userId);
            return findUserById(userId);
        }else{
            return Optional.empty();
        }

    }


}
