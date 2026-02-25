package com.hr.backend.service;

import com.hr.backend.dto.RoleDTO;
import com.hr.backend.model.RoleDB;

import java.util.List;

public interface RoleService {

    RoleDTO handleRole(RoleDTO roleDTO);

    List<RoleDTO> getAllRoles();

    RoleDTO getRoleDTOById(String id);

    RoleDB getRoleById(String id);

    void deleteRole(String id);

}
