package com.hr.backend.service.impl;

import com.hr.backend.dao.CompanyDao;
import com.hr.backend.dto.CompanyDTO;
import com.hr.backend.enums.Status;
import com.hr.backend.exceptions.BadRequestException;
import com.hr.backend.model.CompanyDB;
import com.hr.backend.service.CompanyService;
import com.hr.backend.utils.MyConstants;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CompanyServiceImpl implements CompanyService {

    private final CompanyDao companyDao;

    @Override
    public CompanyDTO handleCompany(CompanyDTO companyDTO){

        CompanyDB companyDB;

        if(companyDTO.getId()!=null){
            companyDB = getCompanyById(companyDTO.getId());
        }
        else{
            companyDB = new CompanyDB();
        }
        
        companyDB.setName(companyDTO.getName());
        companyDB.setDomain(companyDTO.getDomain());
        companyDB.setAbout(companyDTO.getAbout());
        companyDB.setImgUrl(companyDTO.getImgUrl());
        companyDB.setThumbnailUrl(companyDTO.getThumbnailUrl());
        companyDB.setFacebookUrl(companyDTO.getFacebookUrl());

        companyDao.save(companyDB);

        companyDTO.setId(companyDB.getId());
        return companyDTO;
    }

    @Override
    public List<CompanyDTO> getAllCompanies(){
        return companyDao.getAllCompanies();
    }

    @Override
    public void deleteCompanyById(String companyId){
        companyDao.delete(getCompanyById(companyId));
    }

    @Override
    public void softDeleteCompanyById(String companyId) {
        CompanyDB companyDB = getCompanyById(companyId);

        companyDB.setStatus(Status.DELETED);
        companyDao.save(companyDB);
    }

    @Override
    public void activate(String companyId) {
        CompanyDB companyDB = getCompanyById(companyId);

        companyDB.setStatus(Status.ACTIVE);
        companyDao.save(companyDB);
    }

    @Override
    public void inactivate(String companyId) {
        CompanyDB companyDB = getCompanyById(companyId);

        companyDB.setStatus(Status.INACTIVE);
        companyDao.save(companyDB);
    }

    @Override
    public CompanyDTO getCompanyDTOById(String companyId){
        return companyDao.getCompanyDTOById(companyId)
                .orElseThrow(() -> new BadRequestException(MyConstants
                        .ERR_MSG_BAD_REQUEST + "Company: " + companyId));
    }

    @Override
    public CompanyDB getCompanyById(String companyId){
        return companyDao.findById(companyId)
                .orElseThrow(() -> new BadRequestException(MyConstants
                        .ERR_MSG_BAD_REQUEST + "Company: " + companyId));
    }

}
