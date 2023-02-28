package com.devmarcos.library.repositories;

import com.devmarcos.library.entities.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
