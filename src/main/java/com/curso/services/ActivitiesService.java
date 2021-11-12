/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.services;

import com.curso.models.Activities;
import com.curso.repositories.ActivitiesRepository;
import com.curso.repositories.custom.UserActivitiesCustom;
import com.curso.responses.UserActivitiesCustomInt;
import com.curso.responses.UserActivitiesResponse;
import com.cursos.services.impl.ActivitesImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author frooz
 */
@Service
public class ActivitiesService implements ActivitesImpl {

    @Autowired
    private ActivitiesRepository repository;

    @Override
    public Activities save(Activities obj) {
        return repository.save(obj);
    }

    public Activities update(int activityId, Activities obj) {
        Activities current = findById(activityId);
        current.setNombre(obj.getNombre());
        current.setDescription(obj.getDescription());
        current.setStartDate(obj.getStartDate());
        current.setEndDate(obj.getEndDate());
        return repository.save(current);
    }

    public Activities findById(int activityId) {
        return repository.findByActivityId(activityId);
    }

    public List<Activities> getAll() {
        return repository.findAll();
    }

    public String delete(int activityId){
        Activities current = repository.getById(activityId);
        if(current == null){
            return "Activity not found";
        }else{
          repository.delete(current);
          return "Activity deleted";
        }       
    }

    @Override
    public List<UserActivitiesCustomInt> getUserActivitiesInt(int userId) {
        return repository.getUserActivitiesInt(userId);
    }
    
    public List<UserActivitiesResponse> getUserActivitiesResp(int userId) {
        return repository.getUserActivities(userId);
    }
}
