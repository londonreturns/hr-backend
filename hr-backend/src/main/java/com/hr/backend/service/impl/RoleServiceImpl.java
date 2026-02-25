package com.hr.backend.service.impl;

import com.hr.backend.dao.RoleDao;
import com.hr.backend.dto.RoleDTO;
import com.hr.backend.exceptions.BadRequestException;
import com.hr.backend.model.RoleDB;
import com.hr.backend.service.RoleService;
import com.hr.backend.utils.MyConstants;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class RoleServiceImpl implements RoleService {

    private final RoleDao roleDao;

    @Override
    public RoleDTO handleRole(RoleDTO roleDTO){
        RoleDB roleDB;

        if(roleDTO.getId()!=null){
            roleDB = getRoleById(roleDTO.getId());
        }
        else{
            roleDB = new RoleDB();
        }

        roleDB.setName(roleDTO.getName());

        roleDao.save(roleDB);

        roleDTO.setId(roleDB.getId());
        return roleDTO;
    }

    @Override
    public List<RoleDTO> getAllRoles(){
        return roleDao.getAllRoles();
    }

    @Override
    public void deleteRole(String id){
        roleDao.delete(getRoleById(id));
    }

//    @Override
//    public RoleDTO getRoleWithPermissions(String id){
//        RoleDTO roleDTO = getRoleDTOById(id);
//
//    }

    @Override
    public RoleDTO getRoleDTOById(String id){
        return roleDao.getRoleDTOById(id)
                .orElseThrow(() -> new BadRequestException(MyConstants
                        .ERR_MSG_BAD_REQUEST + "Role: " +  id));

    }

    @Override
    public RoleDB getRoleById(String id){
        return roleDao.findById(id)
                .orElseThrow(() -> new BadRequestException(MyConstants
                        .ERR_MSG_BAD_REQUEST + "Role: " + id));
    }

}
