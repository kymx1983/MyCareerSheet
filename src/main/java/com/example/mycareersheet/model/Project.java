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
  private long CareerId;

  @Column(name = "user_id")
  private long UserId;

  @Column(name = "project_from")
  @NotEmpty
  private Date from;

  @Column(name = "project_end")
  private Date end;

  @Column(name = "overview")
  private String overview;

  @Column(name = "charge")
  private String charge;

  @Column(name = "remarks")
  private String remarks;

  @Column(name = "skill")
  private String skill;

  public long getCareerId() {
    return CareerId;
  }

  public void setCareerId(long careerId) {
    CareerId = careerId;
  }

  public long getUserId() {
    return UserId;
  }

  public void setUserId(long userId) {
    UserId = userId;
  }

  public Date getFrom() {
    return from;
  }

  public void setFrom(Date from) {
    this.from = from;
  }

  public Date getEnd() {
    return end;
  }

  public void setEnd(Date end) {
    this.end = end;
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
