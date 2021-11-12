/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.controllers;

import com.curso.models.Users;
import com.curso.services.UsersService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author frooz
 */
@RestController
@RequestMapping("/users")
@CrossOrigin({"*"})
public class UsersController {
    
    @Autowired
    UsersService userService;
    
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Users createUser(@RequestBody Users obj) {
        return userService.save(obj);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Users updateUser(@RequestParam int userId, @RequestBody Users obj) {
        return userService.update(userId, obj);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteUser(@RequestParam int userId) {
        return userService.delete(userId);

    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Users> getAllUsers() {
        return userService.findAll();
    }

    @RequestMapping(value = "/findbyId", method = RequestMethod.GET)
    public Users getById(@RequestParam int userId) {
        return userService.findByuserId(userId);
    }
}
