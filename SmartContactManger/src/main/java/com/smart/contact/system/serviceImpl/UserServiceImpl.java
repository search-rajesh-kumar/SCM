package com.smart.contact.system.serviceImpl;
import com.smart.contact.system.model.User;
import com.smart.contact.system.repository.UserRepo;
import com.smart.contact.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService{

    @Autowired
    UserRepo userRepo;

    @Override
    public User createAndUpdateUser(User user) {
        Optional<User> oldUserData = userRepo.findById(user.getId());
        if(oldUserData.isPresent()){
            User newUserData = oldUserData.get();
            newUserData.setId(user.getId());
            newUserData.setEmail(user.getEmail());
            newUserData.setName(user.getName());
            newUserData.setPassword(user.getPassword());
            newUserData.setRole(user.getRole());
            newUserData.setEnabled(user.isEnabled());
            newUserData.setImageUrl(user.getImageUrl());
            newUserData.setAbout(user.getAbout());
            return userRepo.save(newUserData);
        }else{
           return userRepo.save(user);
        }
    }

    @Override
    public List<User> findAllUser() {
        return userRepo.findAll();
    }

    @Override
    public Optional<User> findUserById(int userId) {
        return userRepo.findById(userId);
    }

    @Override
    public void deleteUserById(int userId) {
        userRepo.deleteById(userId);
    }
}
