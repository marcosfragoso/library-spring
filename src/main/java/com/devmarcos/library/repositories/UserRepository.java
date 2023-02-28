package com.devmarcos.library.repositories;

import com.devmarcos.library.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{
}
