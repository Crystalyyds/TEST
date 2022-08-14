package com.example.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author 20312
 * @author 2022/8/12 19:07
 */
@Data
@Entity//代表实体类
@Table(name ="user" )//对应user表
public class User {
    int id;
    String userName;
    String password;

    public User(int id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }
}
