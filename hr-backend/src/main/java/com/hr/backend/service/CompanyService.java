package com.hr.backend.service;

import com.hr.backend.dto.CompanyDTO;
import com.hr.backend.model.CompanyDB;

import java.util.List;

public interface CompanyService {

    CompanyDTO handleCompany(CompanyDTO companyDTO);

    CompanyDTO getCompanyDTOById(String companyId);

    List<CompanyDTO> getAllCompanies();

    void deleteCompanyById(String companyId);

    CompanyDB getCompanyById(String companyId);

    void softDeleteCompanyById(String companyId);

    void activate(String companyId);

    void inactivate(String companyId);
}
