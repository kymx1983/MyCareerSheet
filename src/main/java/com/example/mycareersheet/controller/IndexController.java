package com.example.mycareersheet.controller;

import com.example.mycareersheet.model.BasicInfo;
import com.example.mycareersheet.model.Project;
import com.example.mycareersheet.model.Skill;
import com.example.mycareersheet.repository.BasicInfoRepository;
import com.example.mycareersheet.repository.ProjectRepository;
import com.example.mycareersheet.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

  /**
   * 職務経歴の編集画面を表示する
   *
   * @return model
   */
  @RequestMapping("/project/new")
  public ModelAndView projectCreateView() {

    ModelAndView model = new ModelAndView();
    ;
    model.setViewName("project/edit.html");
    model.addObject("content", new Project());

    return model;
  }

  /**
   * 職務経歴の編集画面を表示する
   *
   * @return model
   */
  @RequestMapping("/project/edit")
  public ModelAndView projectEditView(@RequestParam long id) {

    ModelAndView model = new ModelAndView();
    model.setViewName("project/edit.html");

    Optional<Project> data = projectRepository.findById(id);

    model.addObject("content", data.get());

    return model;
  }

  /**
   * お問い合わせの新規作成及び更新を行う.
   *
   * @param project Contactエンティティ
   * @return model
   */
  @RequestMapping(value = "/project/create", method = RequestMethod.POST)
  @Transactional(readOnly = false)
  public ModelAndView create(@ModelAttribute("content") @Validated Project project, BindingResult result) {

    if (result.hasErrors()) {
      for (FieldError err : result.getFieldErrors()) {
        System.out.println(err.getDefaultMessage());
      }
      ModelAndView model = new ModelAndView();
      model.setViewName("project/edit.html");
      model.addObject("content", project);
      return model;
    } else {
      projectRepository.saveAndFlush(project);
      return new ModelAndView("redirect:/");
    }
  }

}

