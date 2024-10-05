package org.example.service;

import org.example.UserClient;
import org.example.modal.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserClient userClient;

    public User getUser(Long id){
        return userClient.getUserById(id);
    }
}
