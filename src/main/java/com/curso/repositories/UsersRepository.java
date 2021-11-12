/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.curso.repositories;

import com.curso.models.Users;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author frooz
 */
@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{
    
    @Override
    public Users save (Users obj);
    
    public Users findByuserId( int userId);
    
    @Override
    public List<Users> findAll();
    
    
}
