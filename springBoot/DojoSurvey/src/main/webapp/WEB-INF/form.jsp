<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/show" method="Post">
<label for="name">Your Name:</label>
<input type="text" name="name"><br>            
<lable for="location"> Dojo Location:</lable>   
   <select name="location"><br>
   <option>Hebron</option>
   <option>Ramallah</option>
   <option>Tulkarem</option>
   </select><br>

<lable for="favLanguage"> Favorite Language:</lable>
   <select name="favLanguage"><br>
     <option>python</option>
     <option>Html</option>
     <option>C++</option>
   </select><br>

     <label for="comment">comment (optinal):</label><br>
     <textarea  name="comment" rows="4" cols="50"></textarea><br>

     <input type="submit" value="Button">      
</form>

</body>
</html>