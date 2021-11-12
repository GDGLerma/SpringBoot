/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.repositories.custom;

import com.curso.responses.UserActivitiesResponse;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.hibernate.transform.Transformers;

/**
 *
 * @author frooz
 */
public class UserActivitiesCustomImpl implements UserActivitiesCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<UserActivitiesResponse> getUserActivities(int userId) {
        String sqlString = "SELECT u.NAME AS 'usuario',  a.name AS 'actividad' "
                + "FROM users u "
                + "LEFT JOIN  user_activities ua ON ua.ID_USER = u.ID_USER "
                + "LEFT JOIN  activities a ON a.id_activity = ua.ID_ACTIVITY "
                + "WHERE u.ID_USER = " + userId;

        List<UserActivitiesResponse> query = entityManager.createNativeQuery(sqlString).unwrap(org.hibernate.query.Query.class)
                .setResultTransformer(Transformers.aliasToBean(UserActivitiesResponse.class)).list();

        return query.isEmpty() ? null : query;
    }

}
