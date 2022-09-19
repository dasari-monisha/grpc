package com.example.loanservice.repo;

import com.example.loanservice.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoansRepo extends JpaRepository<Loan,Long> {

}
