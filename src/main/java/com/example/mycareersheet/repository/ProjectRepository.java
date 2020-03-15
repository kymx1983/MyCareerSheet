package com.example.mycareersheet.repository;

import com.example.mycareersheet.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}

