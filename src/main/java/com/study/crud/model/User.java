package com.study.crud.model;

import lombok.Data;

/**
 * @author lance
 * @since 2020-09-25
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;

}
