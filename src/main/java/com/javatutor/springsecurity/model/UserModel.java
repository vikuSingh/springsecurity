package com.javatutor.springsecurity.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user_model")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;

    private String username;
    private String password;

}
