<%
String name=(String)session.getAttribute("name");

if(name!=null)
{
	%>


<div class="alert alert-info alert-dismissible fade show" role="alert">
  <strong><%= name %></strong>
  
  <button type="button" class="close" data-dismiss="alert" aria-label="Close">
    <span aria-hidden="true">&times;</span>
  </button>
</div>
<%
}
session.removeAttribute("name");
%>

