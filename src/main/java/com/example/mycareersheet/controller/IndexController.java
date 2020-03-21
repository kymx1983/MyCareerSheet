package com.example.mycareersheet.controller;

import com.example.mycareersheet.model.BasicInfo;
import com.example.mycareersheet.model.Project;
import com.example.mycareersheet.model.Skill;
import com.example.mycareersheet.repository.BasicInfoRepository;
import com.example.mycareersheet.repository.ProjectRepository;
import com.example.mycareersheet.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

/**
 * IndexController.
 */
@Controller
public class IndexController {

  @Autowired
  BasicInfoRepository basicRepository;

  @Autowired
  ProjectRepository projectRepository;

  @Autowired
  SkillRepository skillRepository;

  /**
   * お問い合わせの一覧を表示する.
   *
   * @return model
   */
  @RequestMapping("/")
  public ModelAndView index() {
    ModelAndView model = new ModelAndView();
    model.setViewName("index");

    Optional<BasicInfo> basic = basicRepository.findById((long) 1);
    if (basic.isPresent()) {
      model.addObject("basic", basic.get());
    } else {
      System.out.println("データがありません");
    }

    List<Project> projects = projectRepository.findAll();
    model.addObject("projects", projects);

    List<Skill> skills = skillRepository.findAll();
    model.addObject("skills", skills);

    return model;
  }
}

