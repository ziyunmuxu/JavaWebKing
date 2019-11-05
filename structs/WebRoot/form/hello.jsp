<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
<html> 
	<head>
		<title>JSP for HelloForm form</title>
	</head>
	<body>
		<html:form action="/hello">
			name : <html:text property="name"/><html:errors property="name"/><br/>
			<html:submit/><html:cancel/>
		</html:form>
	</body>
</html>

