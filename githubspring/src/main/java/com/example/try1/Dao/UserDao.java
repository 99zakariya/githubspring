package com.example.try1.Dao;

import com.example.try1.pojo.User;

import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Integer>  {
    
}
