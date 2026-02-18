package com.hr.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "tbl_user")
@Getter
@Setter
public class UserDB extends BaseDB{

    @Column(name="first_name")
    private String firstName;
}
