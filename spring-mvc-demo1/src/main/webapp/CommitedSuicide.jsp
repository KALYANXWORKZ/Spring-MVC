<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>${name }</h2>
<h2>${dto}</h2>


<form action="Create.do" method="post">

Name:<input type="text" name="name"/> <br><br>

Age : <input type="text"name="age"/><br><br>

Reason : <textarea rows="4" cols="10"></textarea> <br><br>

Gender : <input type="radio" name="gender" value="male"/>Male
          <input type="radio" name="gender" value="female"/>Female
          <input type="radio" name="gender" value="others"/>Others <br><br>
          
NoOfAttempts : <input type="text" name="noOfAttempts"/> <br><br>

Spot: <input type="text" name="spot"/> <br><br>

DateAndTime : <input type="text" name="dateAndTime"> <br><br>

Type : <select name="type">

   <option>---Select---</option>
   <option>Hanging</option>
      <option>Railway Track</option>
         <option>Poison</option>
            <option>Jumping From Building</option>
               <option>Jumping into bhavi,kere</option>               
</select> <br><br>       

<input type="submit" value="Send" style="color: white; background: blue;">  
          
</form>

</body>
</html>