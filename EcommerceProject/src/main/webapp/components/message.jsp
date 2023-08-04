<%
String name=(String)session.getAttribute("name");

if(name!=null)
{
	%>
<div class="bg-light text-info p-2"><p class="fw-bold"> <%=  name %></p></div>
<%
}
session.removeAttribute("name");
%>

