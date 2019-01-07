package com.frank.java.test.main.entity;

/**
 * @Author Frank.Yang
 * @Date 2019/1/7 14:58
 */
public class Address {
  private String addName;

  private String number;

  public String getAddName() {
    return addName;
  }

  public void setAddName(String addName) {
    this.addName = addName;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }
}

enum AddressType{
  A,B,C
}
