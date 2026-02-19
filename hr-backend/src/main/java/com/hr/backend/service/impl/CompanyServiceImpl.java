package com.hr.backend.service.impl;

import com.hr.backend.dao.CompanyDao;
import com.hr.backend.dto.CompanyDTO;
import com.hr.backend.service.CompanyService;
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
    public List<CompanyDTO> getAllCompanies(){
        return companyDao.getAllCompanies();
    }


}
