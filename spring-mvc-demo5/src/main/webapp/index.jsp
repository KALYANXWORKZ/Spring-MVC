<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Criminals Details</title>
</head>
<body>
<h2>${records}</h2>
<h1>Enter Criminal Details</h1>

<a href="Criminal">Click to Show All</a>

<form action="Criminal" method="post"> <br><br>

Name:<input type="text" name="name"><br><br>

Age:<select name="age">
<option>---Select---</option>
<c:forEach begin="12" end="100" var="index">
<option value="${index}">${index}</option>
</c:forEach>
</select> <br><br>

Country: <select name="country">
<option>---Select---</option>
<option>India</option>
<option>China</option>
<option>Pakistan</option>
<option>Bangladesh</option>
<option>SriLanka</option>
<option>America</option>
</select> <br><br>

CriminalType: <select name="criminalType">
<option>---Select---</option>
<option>Full Murder</option>
<option>Half Murder</option>
<option>Rape</option>
<option>Terrorist</option>
</select> <br><br>

NoOfCases: <select name="noOfCases">
<option>---Select---</option>
<c:forEach begin="1" end="100" var="index">
<option value="${index}">${index}</option>
</c:forEach>
</select> <br><br>

Alive: <input type="radio" name="alive" value="Alive">Alive
<input type="radio" name="alive" value="NotAlive">NotAlive <br><br>

Gender: <input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="FeMale">FeMale
<input type="radio" name="gender" value="others">Others <br><br>

International: <input type="radio" name="international" value="International">International
<input type="radio" name="international" value="Domestic">Domestic
<input type="radio" name="international" value="GullyRowdy">GullyRowdy <br><br>

Married: <input type="radio" name="married" value="Married">Married
<input type="radio" name="married" value="UnMarried">"UnMarried"
<input type="radio" name="married" value="others">Others <br><br>

JailTerm: <select name="jailTerm">
<option>---Select---</option>
<option>1</option>
<option>2</option>
<option>3</option>
<option>4</option>
<option>5</option>
<option>6</option>
</select> <br><br>

WifeName: <input type="text" name="wifeName"> <br><br>

RightHandName: <input type="text" name="rightHandName"> <br><br>

LeftHandName: <input type="text" name="leftHandName"> <br><br>

PrisonName: <input type="text" name="prisonName"> <br><br>

NetWorth: <input type="text" name="netWorth"> <br><br>

<input type="submit" value="Save your Record"> <br><br>

</form>  <br><br>


</body>
</html>