package com.hr.backend.controller;

import com.hr.backend.dto.RoleDTO;
import com.hr.backend.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/role")
@RequiredArgsConstructor
public class RoleController {

    private final RoleService roleService;

    @PostMapping
    public ResponseEntity<?> handleRole(RoleDTO roleDTO){
        return new ResponseEntity<>(roleService.handleRole(roleDTO), HttpStatus.OK);
    }

    @GetMapping("/{roleId}")
    public ResponseEntity<?> getRoleById(@PathVariable String roleId){
        return new ResponseEntity<>(roleService.getRoleDTOById(roleId), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getRoles(){
        return new ResponseEntity<>(roleService.getAllRoles(), HttpStatus.OK);
    }

    @DeleteMapping("/{roleId}")
    public ResponseEntity<?> deleteRoleById(@PathVariable String roleId){
        return new ResponseEntity<>(roleService.getAllRoles(), HttpStatus.OK);
    }

}
