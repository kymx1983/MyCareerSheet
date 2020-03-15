package com.example.mycareersheet.controller;

import com.example.mycareersheet.model.BasicInfo;
import com.example.mycareersheet.repository.BasicInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

/**
 * IndexController.
 */
@Controller
public class IndexController {

  @Autowired
  BasicInfoRepository repository;

  /**
   * お問い合わせの一覧を表示する.
   *
   * @return model
   */
  @RequestMapping("/")
  public ModelAndView index() {
    ModelAndView model = new ModelAndView();
    model.setViewName("index");

    Optional<BasicInfo> basic = repository.findById((long)1);
    if(basic.isPresent()){
      model.addObject("basic", basic.get());
    } else {
      System.out.println("データがありません");
    }

    return model;
  }

}
