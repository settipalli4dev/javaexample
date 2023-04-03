package com.h2.api.h2databaseapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.h2.api.h2databaseapi.model.Test;

@Repository
public interface EmployeeRepository extends JpaRepository<Test,Long> {

}
