package com.holler.hollerapp.service;


import com.holler.hollerapp.DTO.UserDTO;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    public String getName(UserDTO userDTO)
    {
        return  userDTO.getName();
    }
}
