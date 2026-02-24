package com.hr.backend.model;

import com.hr.backend.enums.RoleType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_role")
@Getter
@Setter
public class RoleDB extends BaseDB {

    @Column(name = "name", nullable = false)
    private RoleType name;
}
