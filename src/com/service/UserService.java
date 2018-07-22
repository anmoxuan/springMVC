package com.service;

import com.entity.UserEntity;
import com.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List findAll(){
        return userMapper.findAll();
    }
    public UserEntity findOne(Integer uid){
        return userMapper.findOne(uid);
    }
    @Transactional
    public int delete(Integer uid){
        return userMapper.delete(uid);
    }
    @Transactional
    public int add(UserEntity userEntity){
        return userMapper.add(userEntity);
    }
    @Transactional
    public int update(UserEntity userEntity){
        return userMapper.update(userEntity);

    }
    public List findCar(){
        return userMapper.findCar();
    }
}
