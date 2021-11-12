/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cursos.services.impl;

import com.curso.models.Users;
import java.util.List;

/**
 *
 * @author frooz
 */
public interface UserImpl {

    public Users save(Users obj);

    public Users findByuserId(int userId);

    public List<Users> findAll();
}
