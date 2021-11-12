/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.curso.repositories.custom;

import com.curso.responses.UserActivitiesResponse;
import java.util.List;

/**
 *
 * @author frooz
 */
public interface UserActivitiesCustom {
    
    public List<UserActivitiesResponse> getUserActivities(int userId);    
}
