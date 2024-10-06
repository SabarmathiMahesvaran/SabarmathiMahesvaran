package com.csc.collegeServices;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CollegeRepository extends JpaRepository<CollegeEntity, Long> {
}
