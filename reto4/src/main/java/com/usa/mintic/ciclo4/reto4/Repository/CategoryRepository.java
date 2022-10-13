/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.mintic.ciclo4.reto4.Repository;

import com.usa.mintic.ciclo4.reto4.Repository.crurepository.CategoryInterface;
import com.usa.mintic.ciclo4.reto4.Entities.Category;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author MG1323
 */

@Repository

public class CategoryRepository {
    @Autowired
    private CategoryInterface extensionesCrud;
    
    public List<Category> getAll (){
        return(List<Category>) extensionesCrud.findAll();
    }
    
    public Optional<Category> getCategory (int id) {
        return extensionesCrud. findById(id);
    
    }
    
    public Category save (Category category){
        return extensionesCrud.save(category);
        
    
    }
    
    public void delete (Category category){
        extensionesCrud.delete(category);
    }

        
  
 
    }
    
    
    
    
