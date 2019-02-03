package com.anupam.springjpapostgre.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "\"User\"")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
