/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.curso.repositories;

import com.curso.models.UserActivities;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author frooz
 */
@Repository
public interface UserActivitiesRepository extends  JpaRepository<UserActivities, Integer>{
    
    @Override
    public UserActivities save(UserActivities obj);

    public UserActivities findByuserActivityId(int userId);

    @Override
    public List<UserActivities> findAll();
}
