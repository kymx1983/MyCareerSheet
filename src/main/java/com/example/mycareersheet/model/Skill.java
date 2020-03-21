package com.example.mycareersheet.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "skill")
public class Skill {

  @Id
  @Column(name = "skill_id")
  private long skillId;

  @Column(name = "user_id")
  private long userId;

  @Column(name = "type")
  private String type;

  @Column(name = "skill_name")
  private String skillName;

  @Column(name = "period")
  private int period;

  @Column(name = "level")
  private String level;

  public long getSkillId() {
    return skillId;
  }

  public void setSkillId(long skillId) {
    this.skillId = skillId;
  }

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getSkillName() {
    return skillName;
  }

  public void setSkillName(String skillName) {
    this.skillName = skillName;
  }

  public int getPeriod() {
    return period;
  }

  public void setPeriod(int period) {
    this.period = period;
  }

  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }
}
