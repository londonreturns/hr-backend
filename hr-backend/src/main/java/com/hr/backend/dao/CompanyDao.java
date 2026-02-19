package com.hr.backend.dao;

import com.hr.backend.dto.CompanyDTO;
import com.hr.backend.model.CompanyDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyDao extends JpaRepository<CompanyDB, String> {

    @Query(" SELECT new com.hr.backend.dto.CompanyDTO(c.id, c.name, c.domain, c.about, c.imgUrl, c.thumbnailUrl, c.facebookUrl) FROM CompanyDB c ")
    List<CompanyDTO> getAllCompanies();

}
