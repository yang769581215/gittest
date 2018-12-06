package com.frank.java.test.excption;

/**
 * @Author Frank.Yang
 * @Date 2018/12/6 16:50
 */
public class MyException extends Exception{

  public MyException(String message) {
    super(message);
  }

  public MyException(String message, Throwable cause) {
    super(message, cause);
    setStackTrace(cause.getStackTrace());
  }
}
