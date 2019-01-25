package com.kevin.mybatis_demo.dao;

import com.kevin.mybatis_demo.model.UserDomain;

import java.util.List;

public interface UserDao {
    int insert(UserDomain record);
    int update(UserDomain record);
    int delete(UserDomain record);
    List<UserDomain> selectUsers();
}
