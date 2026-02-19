package com.hr.backend.controller;

import com.hr.backend.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/company")
@RequiredArgsConstructor
public class CompanyController {

    private final CompanyService companyService;

    @GetMapping("/get-all")
    public ResponseEntity<?> getCompanies(){
        return ResponseEntity.ok(companyService.getAllCompanies());
    }

}
