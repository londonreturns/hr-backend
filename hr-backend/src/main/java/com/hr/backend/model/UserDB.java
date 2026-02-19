package com.hr.backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "tbl_user")
@Getter
@Setter
public class UserDB extends BaseDB{

    @Column(name="employee_id", unique=true, nullable=false)
    private String employeeId;

    @Column(name="first_name", nullable=false)
    private String firstName;

    @Column(name="last_name", nullable=false)
    private String lastName;

    @Column(name="address", nullable=false)
    private String address;

    @Column(name="phone_number", unique=true, nullable=false)
    private Integer phoneNumber;

    @Column(name="email", unique=true, nullable=false)
    private String email;

    @Column(name="password", nullable=false)
    private String password;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private CompanyDB company;

    @Column(name = "company_id", insertable = false, updatable = false)
    private String companyId;
}
