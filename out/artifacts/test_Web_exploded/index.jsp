<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="html" uri="/WEB-INF/tld/struts-html.tld" %>
<html>
<head>
    <title>Hello!</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
    <h1>Привет, введи свои возраст и имя</h1>
    <html:form action="MyForm">
        Введи имя: <html:text property="name" />
        Введи возраст: <html:text property="age" />
        <html:submit />
    </html:form>
</body>
</html>
