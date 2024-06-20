package com.javabean;
 
public class User {
    private String name;
    private int age;
    
    
    public User() {}
 
 
	public String getName() {
		return name;
	}
 
 
	public void setName(String name) {
		this.name = name;
	}
 
 
	public int getAge() {
		return age;
	}
 
 
	public void setAge(int age) {
		this.age = age;
	}
    
  
}


-------------------------------------------


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This is a JSP Page</title>
</head>
<body>
<jsp:useBean id="user" class="com.javabean.User" scope="session" />
<jsp:setProperty name="user" property="name" value="John Doe" />
<jsp:setProperty name="user" property="age" value="30" />
Name: <jsp:getProperty name="user" property="name" /><br />
Age: <jsp:getProperty name="user" property="age" />
</body>
</html>
