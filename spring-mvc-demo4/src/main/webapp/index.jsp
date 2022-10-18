<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="shirt" method="post">

Brand: <input type="text" name="Brand"/> <br><br>
Size: <select name="size">
<option>Small</option>
<option>Medium</option>
<option>Large</option>
</select> <br><br>

Price: <input type="text" name="price" />  <br><br>
Discount: <select name="discount">
<option>---Select--</option>
<option>10%</option>
<option>20%</option>
<option>30%</option>
</select><br><br>

Quantity: <select name="quantity">
<option>---Select--</option>
<option>10</option>
<option>20</option>
<option>30</option>
<option>40</option>
<option>50</option>
<option>60</option>
<option>70</option>
<option>80</option>
<option>90</option>
<option>100</option>
<option>200</option>
<option>300</option>
<option>400</option>
<option>500</option>
<option>600</option>
<option>700</option>
<option>800</option>
<option>900</option>
<option>1000</option>
</select><br><br>

Gender: <input type="radio" name="gender" value="male" />Male
<input type="radio" name="gender" value="female" />Female
<input type="radio" name="gender" value="others" />Others <br><br>

Color: <select name="color">
<option>---select---</option>
<option>White</option>
<option>Black</option>
<option>Pink</option>
<option>Blue</option>
<option>Red</option>
<option>Orange</option>
<option>Yellow</option>

</select> <br><br>

<input type="submit" value="Save"/>

</form>

</body>
</html>