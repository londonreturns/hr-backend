package com.hr.backend.controller;

import com.hr.backend.dto.CompanyDTO;
import com.hr.backend.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    @PostMapping
    public ResponseEntity<?> handleCompany(@RequestBody CompanyDTO companyDTO){
        CompanyDTO company = companyService.handleCompany(companyDTO);
        return new ResponseEntity<>(company, HttpStatus.OK);
    }

    @GetMapping("/{companyId}")
    public ResponseEntity<?> getCompanyById(@PathVariable String companyId){
        CompanyDTO companyDTO = companyService.getCompanyDTOById(companyId);
        return new ResponseEntity<>(companyDTO, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getCompanies(){
        return new ResponseEntity<>(companyService.getAllCompanies(), HttpStatus.OK);
    }

    @DeleteMapping("/{companyId}")
    public ResponseEntity<?> deleteCompanyById(@PathVariable String companyId){
        companyService.deleteCompanyById(companyId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
