/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.controllers;

import com.curso.models.Activities;
import com.curso.repositories.custom.UserActivitiesCustom;
import com.curso.responses.UserActivitiesCustomInt;
import com.curso.responses.UserActivitiesResponse;
import com.curso.services.ActivitiesService;
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
@RequestMapping("/activities")
@CrossOrigin({"*"})
public class ActivitesController {

    @Autowired
    ActivitiesService activitiesService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Activities createActivity(@RequestBody Activities obj) {
        return activitiesService.save(obj);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public Activities updateActivity(@RequestParam int activityId, @RequestBody Activities obj) {
        return activitiesService.update(activityId, obj);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteActivity(@RequestParam int activityId) {
        return activitiesService.delete(activityId);

    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Activities> getAllActivities() {
        return activitiesService.getAll();
    }

    @RequestMapping(value = "/findbyId", method = RequestMethod.GET)
    public Activities getById(@RequestParam int activityId) {
        return activitiesService.findById(activityId);
    }
    
    @RequestMapping(value = "/userActivitiesInt", method = RequestMethod.GET)
    public List<UserActivitiesCustomInt> getUserActivities(@RequestParam int userId) {
        return activitiesService.getUserActivitiesInt(userId);
    }
    
    @RequestMapping(value = "/userActivitiesResp", method = RequestMethod.GET)
    public List<UserActivitiesResponse> getUserActivitiesResp(@RequestParam int userId) {
        return activitiesService.getUserActivitiesResp(userId);
    }
}
