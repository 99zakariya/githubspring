package com.example.try1.Dao;

import com.example.try1.pojo.MaterVehicle;

import org.springframework.data.repository.CrudRepository;
public interface MaterVehicleDao extends CrudRepository<MaterVehicle, String> {
    
}
// 