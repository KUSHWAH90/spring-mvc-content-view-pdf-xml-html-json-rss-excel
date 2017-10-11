<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<title>New/Edit Contact</title>
</head>
<body>
<div class="container-fluid">
 <div class="row">
    <div class="col-md-12">
    <div class="clearfix"></div>
     <div class="panel panel-default">
    <div class="panel-heading text-center"><h3>EMPLOYEE FORM</h3></div>
    <div class="panel-body">
        <div class="panel-heading"></div>
        <form:form action="saveEmployee" method="post" modelAttribute="employee">
        <table class="table">
            <form:hidden path="id"/>
            <tr>
                <td>Name:</td>
                <td><form:input path="name" class="form-control"/></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><form:input path="email" class="form-control"/></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><form:input path="address" class="form-control"/></td>
            </tr>
            <tr>
                <td>Telephone:</td>
                <td><form:input path="telephone" class="form-control" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save" class="btn btn-info"></td>
            </tr>
        </table>
        </form:form>
    </div>
    
    </div>
    </div>
    </div>
</body>
</html>