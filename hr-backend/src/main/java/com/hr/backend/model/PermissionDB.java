package com.hr.backend.model;

import com.hr.backend.enums.Permission;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_permission")
@Getter
@Setter
public class PermissionDB extends BaseDB {

    @Column(name = "name", nullable = false)
    private Permission name;

}
