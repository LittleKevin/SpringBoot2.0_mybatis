package com.kevin.mybatis_demo.service;

import com.github.pagehelper.PageInfo;
import com.kevin.mybatis_demo.model.UserDomain;

public interface UserService {
    int addUser(UserDomain user);
    int updateUser(UserDomain user);
    int deleteUser(UserDomain user);
    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}
