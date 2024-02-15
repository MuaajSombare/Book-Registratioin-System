<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.*"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


 <form action="retrivedata">
    <table border="1px">
      <tr>
        <th>bookname</th>
        <th>edition</th>
        <th>price</th>
      </tr>
      <tr>
        <td>
		<%
		List<String> s = (List<String>)request.getAttribute("bname");
		if(s != null){
			out.println(s);
		}
		%>
        </td>
        
        <td>
		<%
		List<String> s1 = (List<String>)request.getAttribute("edt");
		if(s1 != null){
			out.println(s1);
		}
		%>
        </td>
        
        <td>
          <%
          List<Double> s2 = (List<Double>)request.getAttribute("price");
		if(s2 != null){
			out.println(s2);
		}
		%>
        </td>
        
      </tr>
      
    </table>
   
  <input type="submit" value="Click the buttong to see list">
    
  </form>
  
</body>

</html>