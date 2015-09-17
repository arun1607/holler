package com.holler.hollerapp.controller;

import com.holler.hollerapp.DTO.UserDTO;
import com.holler.hollerapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@RequestMapping("/api/holler/v0")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService)
    {
        this.userService = userService;
    }


    @RequestMapping(value = "/users",method = RequestMethod.POST)
    @ResponseBody
    public String createUser(@Valid  @RequestBody UserDTO userRequest) {
        return userService.getName(userRequest);
    }
}
