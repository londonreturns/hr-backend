package com.hr.backend.dao;

import com.hr.backend.dto.RoleDTO;
import com.hr.backend.model.RoleDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoleDao extends JpaRepository<RoleDB, String> {

    @Query(" SELECT new com.hr.backend.dto.RoleDTO(r.id, r.name) " +
            " FROM RoleDB r ")
    List<RoleDTO> getAllRoles();

    @Query(" SELECT new com.hr.backend.dto.RoleDTO(r.id, r.name) " +
            " FROM RoleDB r ")
    Optional<RoleDTO> getRoleDTOById(String id);

}
