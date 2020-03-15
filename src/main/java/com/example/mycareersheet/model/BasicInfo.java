package com.example.mycareersheet.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name = "basic_info")
public class BasicInfo {
  @Id
  @Column(name = "user_id")
  private long userId;

  @Column(name = "user_name")
  @NotEmpty
  private String userName;

  @Column(name = "birthday")
  private Date birthday;

  @Column(name = "gender")
  private int gender;

  @Column(name = "address")
  private String address;

  @Column(name = "tel")
  private String tel;

  @Column(name = "mail")
  private String mail;

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    userId = userId;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public int getGender() {
    return gender;
  }

  public void setGender(int gender) {
    this.gender = gender;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }
}
