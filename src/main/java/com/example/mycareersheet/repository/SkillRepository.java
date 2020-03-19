package com.example.mycareersheet.repository;

import com.example.mycareersheet.model.Project;
import com.example.mycareersheet.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}

