package com.kevin.mybatis_demo.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDomain {
    private Integer userId;
    private String userName;
    private String password;
    private String phone;
}
