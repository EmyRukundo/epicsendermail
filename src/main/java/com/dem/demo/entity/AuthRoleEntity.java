package com.dem.demo.entity;


import com.dem.demo.entityDTO.AuthRole;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class AuthRoleEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private AuthRole name;

    public AuthRoleEntity(){

    }

    public AuthRoleEntity(AuthRole name){
        this.name = name;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AuthRole getName(){
        return name;
    }
    public void setName(AuthRole name){
        this.name = name;
    }
}
