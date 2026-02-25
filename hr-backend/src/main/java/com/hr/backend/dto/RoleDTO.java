package com.hr.backend.dto;

import com.hr.backend.enums.Role;
import lombok.Data;

import java.util.List;

@Data
public class RoleDTO {

    public RoleDTO(String id, Role name) {
        this.id = id;
        this.name = name;
    }

    private String id;
    private Role name;
    private List<String> permissions;

}
