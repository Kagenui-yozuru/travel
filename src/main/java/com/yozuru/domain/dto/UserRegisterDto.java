package com.yozuru.domain.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author Yozuru
 */
@Data
public class UserRegisterDto {
    private String username;

    private String password;

    private String name;

    private Date birthday;

    private String sex;

    private String telephone;

    private String email;
}
