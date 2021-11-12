/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cursos.services.impl;

import com.curso.models.Activities;
import com.curso.responses.UserActivitiesCustomInt;
import java.util.List;

/**
 *
 * @author frooz
 */
public interface ActivitesImpl {
 
    public Activities save(Activities obj);
    
    public List<UserActivitiesCustomInt> getUserActivitiesInt(int userId);
}
