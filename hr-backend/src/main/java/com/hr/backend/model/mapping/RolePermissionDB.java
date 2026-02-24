package com.hr.backend.model.mapping;

import com.hr.backend.model.BaseDB;
import com.hr.backend.model.PermissionDB;
import com.hr.backend.model.RoleDB;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_company")
@Getter
@Setter
public class RolePermissionDB extends BaseDB {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private RoleDB role;

    @Column(name = "role_id", insertable = false, updatable = false)
    private String roleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "permission_id", referencedColumnName = "id")
    private PermissionDB permission;

    @Column(name = "permission_id", insertable = false, updatable = false)
    private String permissionId;

}
