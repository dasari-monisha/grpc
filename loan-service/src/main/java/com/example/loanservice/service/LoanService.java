package com.example.loanservice.service;

import com.example.loanservice.repo.LoansRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

    @Autowired
    LoansRepo loansRepo;



}
