package com.example.mycareersheet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name = "project")
public class Project {
  @Id
  @Column(name = "career_id")
  private long id;

  @Column(name = "user_id")
  private long UserId;

  @Column(name = "from_year")
  private int from_year;

  @Column(name = "from_month")
  private int from_month;

  @Column(name = "end_year")
  private int end_year;

  @Column(name = "end_month")
  private int end_month;

  @Column(name = "title")
  @NotEmpty(message = "タイトルを入力してください。")
  private String title;

  @Column(name = "overview")
  @NotEmpty(message = "概要を入力してください。")
  private String overview;

  @Column(name = "charge")
  @NotEmpty(message = "担当業務を入力してください。")
  private String charge;

  @Column(name = "remarks")
  private String remarks;

  @Column(name = "skill")
  @NotEmpty(message = "スキルを入力してください。")
  private String skill;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public long getUserId() {
    return UserId;
  }

  public void setUserId(long userId) {
    UserId = userId;
  }

  public int getFrom_year() {
    return from_year;
  }

  public void setFrom_year(int from_year) {
    this.from_year = from_year;
  }

  public int getFrom_month() {
    return from_month;
  }

  public void setFrom_month(int from_month) {
    this.from_month = from_month;
  }

  public int getEnd_year() {
    return end_year;
  }

  public void setEnd_year(int end_year) {
    this.end_year = end_year;
  }

  public int getEnd_month() {
    return end_month;
  }

  public void setEnd_month(int end_month) {
    this.end_month = end_month;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getOverview() {
    return overview;
  }

  public void setOverview(String overview) {
    this.overview = overview;
  }

  public String getCharge() {
    return charge;
  }

  public void setCharge(String charge) {
    this.charge = charge;
  }

  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public String getSkill() {
    return skill;
  }

  public void setSkill(String skill) {
    this.skill = skill;
  }
}
