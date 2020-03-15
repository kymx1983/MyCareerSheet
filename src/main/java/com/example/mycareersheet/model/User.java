package com.example.mycareersheet.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "user")
public class User {
  @Id
  @Column(name = "user_id")
  private long userId;

  @Column(name = "login_id")
  @NotEmpty(message = "ログインIDを入力してください。")
  private String loginId;

  @Column(name = "password")
  @NotEmpty(message = "パスワードを入力してください。")
  private String password;

  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    userId = userId;
  }

  public String getLoginId() {
    return loginId;
  }

  public void setLoginId(String loginId) {
    this.loginId = loginId;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
