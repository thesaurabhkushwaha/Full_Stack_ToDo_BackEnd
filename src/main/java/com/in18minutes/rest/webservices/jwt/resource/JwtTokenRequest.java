package com.in18minutes.rest.webservices.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;

    public JwtTokenRequest() {
        super();
    }
    
  //  {
  //      "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJTYXVyYWJoIiwiZXhwIjoxNjIzMjE3MzYzLCJpYXQiOjE2MjI2MTI1NjN9.U5-UKcdrDW16oWgKgQUZ7wwwD0JtsTO7j88FAELNxwP00OJcpYkFD3LOKLUSRQkLSFi1XLSx146s1Dhue5hDZA"
  //  }
    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

