<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="backgeound:#e2e2e2">

<h1>First JSP page</h1>
<%!
int a=50;
int b=5;
String name="Nandini";
public int doSum(){
	return a+b;
}
public String reverse(){
	StringBuffer sb=new StringBuffer(name);
	return sb.reverse().toString();
}
%>
<% 
out.println(a);
out.println("<br>");
out.println(b);
out.println("<br>");
out.println(doSum());
out.println("<br>");
out.println(reverse());

%>


<h1>Sum is : <%=doSum()%></h1>
<h1 style="color:red"> <%=a%></h1>
<h1 style="color:pink"> <%=name%></h1>

</body>
</html>