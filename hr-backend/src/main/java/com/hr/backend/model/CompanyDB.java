package com.hr.backend.model;

import com.hr.backend.enums.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_company")
@Getter
@Setter
public class CompanyDB extends BaseDB{

    public CompanyDB() {
        this.status = Status.ACTIVE;
    }

    @Column(name="name", nullable=false)
    private String name;

    @Column(name="status", nullable = false)
    private Status status;

    @Column(name="domain", unique = true, nullable=false)
    private String domain;

    @Column(name="about")
    private String about;

    @Column(name="img_url")
    private String imgUrl;

    @Column(name="thumbnail_url")
    private String thumbnailUrl;

    @Column(name="facebook_url")
    private String facebookUrl;
}
