package com.example.mycareersheet.repository;

import com.example.mycareersheet.model.BasicInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasicInfoRepository extends JpaRepository<BasicInfo, Long> {
}

