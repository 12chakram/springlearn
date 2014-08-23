<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%String context=request.getContextPath();%>
<html>
<head>
  <meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>
  <title>My User Form!</title>
</head>
<body>
<font color='red'><form:errors path='global' /></font>
<div>
  <form:form method='post' action='/customer/addCustomer' commandName='customer'>
    <table>
      <tr>
        <td>First Name: <font color='red'><form:errors path='firstName' /></font></td>
      </tr>
      <tr>
        <td><form:input path='firstName' /></td>
      </tr>
      <tr>
        <td>Last Name: <font color='red'><form:errors path='lastName' /></font></td>
      </tr>
       <tr>
        <td><form:input path='lastName' /></td>
      </tr>
      <tr>
        <td>Email: <font color='red'><form:errors path='email' /></font></td>
      </tr>
       <tr>
        <td><form:input path='email' /></td>
      </tr>
      <tr>
        <td>Password: <font color='red'><form:errors path='password' /></font></td>
      </tr>
       <tr>
        <td><form:input path='password' /></td>
      </tr>
      <tr>
        <td>Confirm Password: <font color='red'><form:errors path='cnfmpassword' /></font></td>
      </tr>
      <tr>
        <td><form:input path='cnfmpassword' /></td>
      </tr>
      <tr>
        <td>Mobile: <font color='red'><form:errors path='mobile' /></font></td>
      </tr>
     <tr>
        <td><form:input path='mobile' /></td>
      </tr>
      <tr>
        <td><input type='submit' value='Submit' /></td>
      </tr>
    </table>
   </form:form>
   </div>
</body>
</html>