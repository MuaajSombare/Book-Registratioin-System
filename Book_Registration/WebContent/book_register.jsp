<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
  <form action="Registration">
    <h1>Book Registration</h1>
    Book Name
    <input type="text" name="bname"><br><br>
    Book Edition
    <input type="text" name="bedition"><br><br>

    Enter Price
    <input type="text" name="bprice"><br><br>
  
    <input type="submit">
    <input type="reset"><br><br>
	<a href="BookList.jsp">Book List</a>
  </form>
</body>
</html>