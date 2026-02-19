package com.hr.backend.model;

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

    @Column(name="name", nullable=false)
    private String name;

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
