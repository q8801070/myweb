package com.myweb.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
//使用者資訊
public class User implements Serializable {

    private int id;
    private String username;
    private String password;
    private String name;

}