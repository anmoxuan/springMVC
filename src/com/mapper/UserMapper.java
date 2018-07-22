package com.mapper;

import com.entity.UserEntity;

import java.util.List;

public interface UserMapper {
    List findAll();
    int add(UserEntity userEntity);
    int delete(Integer uid);
    int update(UserEntity userEntity);
    UserEntity findOne(Integer uid);

    List findCar();
}
