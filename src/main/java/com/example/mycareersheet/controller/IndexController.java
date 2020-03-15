package com.example.mycareersheet.controller;

import com.example.mycareersheet.entity.ProjectEntity;
import com.example.mycareersheet.model.BasicInfo;
import com.example.mycareersheet.model.Project;
import com.example.mycareersheet.repository.BasicInfoRepository;
import com.example.mycareersheet.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
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

  /**
   * お問い合わせの一覧を表示する.
   *
   * @return model
   */
  @RequestMapping("/")
  public ModelAndView index() {
    ModelAndView model = new ModelAndView();
    model.setViewName("index");

    Optional<BasicInfo> basic = basicRepository.findById((long)1);
    if(basic.isPresent()){
      model.addObject("basic", basic.get());
    } else {
      System.out.println("データがありません");
    }

    List<Project> projects = projectRepository.findAll();
    
    List<ProjectEntity> list = new ArrayList<>();

    for (Project project : projects) {
      ProjectEntity entity = new ProjectEntity(project);
      System.out.println("表示します");
      System.out.println("title:" + project.getTitle());
      list.add(entity);
    }

    System.out.println("list件数:" + list.size());
    
    model.addObject("projects", list);

    int count = projects.size();
    System.out.println("件数：" + count);

    return model;
  }

}
