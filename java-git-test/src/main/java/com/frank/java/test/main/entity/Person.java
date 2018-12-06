package com.frank.java.test.main.entity;

/**
 * @Author Frank.Yang
 * @Date 2018/12/6 17:14
 */
public class Person {
  private String pName;
  private Integer age;

  public Person(String pName, Integer age) {
    this.pName = pName;
    this.age = age;
    System.out.println("init");
  }


  public String getpName() {
    return pName;
  }

  public void setpName(String pName) {
    this.pName = pName;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }


}
