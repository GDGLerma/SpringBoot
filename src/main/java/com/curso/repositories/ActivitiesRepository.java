/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.curso.repositories;

import com.curso.models.Activities;
import com.curso.repositories.custom.UserActivitiesCustom;
import com.curso.responses.UserActivitiesCustomInt;
import com.curso.responses.UserActivitiesResponse;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author frooz
 */
@Repository
public interface ActivitiesRepository extends JpaRepository<Activities, Integer>, UserActivitiesCustom {

    @Override
    public Activities save(Activities obj);

    public Activities findByActivityId(int activityId);

    @Override
    public void delete(Activities obj);

    @Query(nativeQuery = true, value = "SELECT u.NAME AS 'usuario',  a.name AS 'actividad' "
            + "FROM users u "
            + "LEFT JOIN  user_activities ua ON ua.ID_USER = u.ID_USER "
            + "LEFT JOIN  activities a ON a.id_activity = ua.ID_ACTIVITY "
            + "WHERE u.ID_USER = :userId")
    public List<UserActivitiesCustomInt> getUserActivitiesInt(int userId);
}
