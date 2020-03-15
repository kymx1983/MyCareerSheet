package com.example.mycareersheet.entity;

import com.example.mycareersheet.model.Project;

public class ProjectEntity {
  private String period;

  private String content;

  private String skill;

  public String getPeriod() {
    return period;
  }

  public void setPeriod(String period) {
    this.period = period;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getSkill() {
    return skill;
  }

  public void setSkill(String skill) {
    this.skill = skill;
  }
}
