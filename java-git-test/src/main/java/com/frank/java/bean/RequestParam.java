package com.frank.java.bean;

/**
 * @Author Frank.Yang
 * @Date 2019/3/20 14:34
 */
public class RequestParam {
  private String requestKey;
  private String sessionId;
  private String searchParam;

  public String getSearchParam() {
    return searchParam;
  }

  public void setSearchParam(String searchParam) {
    this.searchParam = searchParam;
  }

  public String getRequestKey() {
    return requestKey;
  }

  public void setRequestKey(String requestKey) {
    this.requestKey = requestKey;
  }

  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }
}
