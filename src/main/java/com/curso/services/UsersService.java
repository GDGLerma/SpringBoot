/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.services;

import com.curso.models.Users;
import com.curso.repositories.UsersRepository;
import com.cursos.services.impl.UserImpl;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author frooz
 */
@Service
public class UsersService implements UserImpl {

    @Autowired
    private UsersRepository repository;

    @Override
    public Users save(Users obj) {
        if(obj.getCreationDate() != null){
         return repository.save(obj);   
        }else{
            obj.setCreationDate(new Date());
        return repository.save(obj);}        
    }

    public Users update(int userId, Users obj) {
        Users current = findByuserId(userId);
        current.setName(obj.getName());
        return repository.save(current);
    }

    @Override
    public Users findByuserId(int userId) {
        return repository.findByuserId(userId);
    }

    @Override
    public List<Users> findAll() {
        return repository.findAll();
    }

      public String delete(int userId){
        Users current = repository.findByuserId(userId);
        if(current.getUserId() == null){
            return "User not found";
        }else{
          repository.delete(current);
          return "User deleted";
        }       
    }
}
