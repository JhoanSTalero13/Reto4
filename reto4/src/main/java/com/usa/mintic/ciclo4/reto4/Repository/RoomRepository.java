/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.mintic.ciclo4.reto4.Repository;

import com.usa.mintic.ciclo4.reto4.Repository.crurepository.RoomInterface;
import com.usa.mintic.ciclo4.reto4.Entities.Room;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

  @Repository

public class RoomRepository {
     @Autowired
    private RoomInterface extensionesCrud;
    
    public List<Room> getAll(){
        return (List<Room>) extensionesCrud.findAll();
    }
    
    public Optional<Room> getRoom(int id){
        return extensionesCrud.findById(id);
    }
    
    public Room save (Room room){
        return extensionesCrud.save(room);
    } 
    
    public void delete (Room room){
        extensionesCrud.delete(room);
    }


}


