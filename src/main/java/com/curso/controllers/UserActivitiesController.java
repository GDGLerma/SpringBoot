/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.controllers;

import com.curso.models.UserActivities;
import com.curso.services.UserActivitiesService;
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
@RequestMapping("/user_activities")
@CrossOrigin({"*"})
public class UserActivitiesController {

    @Autowired
    UserActivitiesService userActService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public UserActivities createUserActivity(@RequestBody UserActivities obj) {
        return userActService.save(obj);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public UserActivities updateActivity(@RequestParam int userActivityId, @RequestBody UserActivities obj) {
        return userActService.update(userActivityId, obj);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public String deleteActivity(@RequestParam int userActivityId) {
        return userActService.delete(userActivityId);

    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<UserActivities> getAllUserActivities() {
        return userActService.findAll();
    }

    @RequestMapping(value = "/findbyId", method = RequestMethod.GET)
    public UserActivities getById(@RequestParam int userActivityId) {
        return userActService.findByuserActivityId(userActivityId);
    }
}
