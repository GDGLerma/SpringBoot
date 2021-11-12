/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author frooz
 */
@Entity
@Table(name = "USER_ACTIVITIES")
public class UserActivities implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USER_ACTIVITY")
    private Integer userActivityId;
    @Column(name = "ID_USER")
    private Integer userId;
    @Column(name = "ID_ACTIVITY")
    private Integer activityId;
    

    public Integer getUserActivityId() {
        return userActivityId;
    }

    public void setUserActivityId(Integer userActivityId) {
        this.userActivityId = userActivityId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

}
