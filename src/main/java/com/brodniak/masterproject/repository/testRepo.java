package com.brodniak.masterproject.repository;

import com.brodniak.masterproject.entity.test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface testRepo extends JpaRepository<test, Long> {

}
