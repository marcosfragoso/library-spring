package com.devmarcos.library.repositories;

import com.devmarcos.library.entities.PublishingCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublishingCompanyRepository extends JpaRepository<PublishingCompany, Long> {
}
