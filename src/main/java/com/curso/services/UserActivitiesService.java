/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.services;

import com.curso.models.UserActivities;
import com.curso.repositories.UserActivitiesRepository;
import com.cursos.services.impl.UserActivitiesImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author frooz
 */
@Service
public class UserActivitiesService implements UserActivitiesImpl {

    @Autowired
    private UserActivitiesRepository repository;

    @Override
    public UserActivities save(UserActivities obj) {
        return repository.save(obj);
    }

    public UserActivities update(int userActivityId, UserActivities obj) {
        UserActivities current = findByuserActivityId(userActivityId);
        current.setUserId(obj.getUserId());
        current.setActivityId(obj.getActivityId());
        return repository.save(obj);
    }

    @Override
    public UserActivities findByuserActivityId(int userId) {
        return repository.findByuserActivityId(userId);
    }

    @Override
    public List<UserActivities> findAll() {
        return repository.findAll();
    }

     public String delete(int userActivityId) {
       UserActivities current = repository.findByuserActivityId(userActivityId);
        if(current == null){
            return "User Activity not found";
        }else{
          repository.delete(current);
          return "User Activity deleted";
        }  
    }
}
