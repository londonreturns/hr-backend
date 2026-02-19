package com.hr.backend.dto;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CompanyDTO {

    public CompanyDTO(String id, String name, String domain, String about, String imgUrl, String thumbnailUrl, String facebookUrl) {
        this.id = id;
        this.name = name;
        this.domain = domain;
        this.about = about;
        this.imgUrl = imgUrl;
        this.thumbnailUrl = thumbnailUrl;
        this.facebookUrl = facebookUrl;
    }

    private String id;

    private String name;

    private String domain;

    private String about;

    private String imgUrl;

    private String thumbnailUrl;

    private String facebookUrl;

}
