/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cursos.services.impl;

import com.curso.models.UserActivities;
import java.util.List;

/**
 *
 * @author frooz
 */
public interface UserActivitiesImpl {

    public UserActivities save(UserActivities obj);

    public UserActivities findByuserActivityId(int userId);

    public List<UserActivities> findAll();
}
