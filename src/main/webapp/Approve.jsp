<%@ page import="java.util.List" %>
<%@ page import="com.github.vertineko.homework3.model.deshenpi" %>
<%@ page import="com.github.vertineko.homework3.model.Course" %>
<%@ page import="com.github.vertineko.homework3.service.CourseSevice" %><%--
  Created by IntelliJ IDEA.
  User: 11732
  Date: 2023/4/12
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Approve</title>
    <link type="text/css" rel="stylesheet" href="css/Approve.css">
    <script type="text/javascript" src="js/Approve.js"></script>
</head>
<body>
    <h1>待审核</h1>
    <table id="shenpi">
        <tr>
            <th>id</th>
            <th>name</th>
            <th>status</th>
            <th>action</th>
            <th>&nbsp;</th>
        </tr>
    <%
        List<deshenpi> deshenpis = CourseSevice.getCourseSevice().showAllDecourse();
        for (deshenpi Deshenpi:deshenpis){

    %>
        <tr>
            <td><%=Deshenpi.getId()%></td>
            <td><%=Deshenpi.getName()%></td>
            <td><%=Deshenpi.getStatus()%></td>
            <td><input type="button" value="通过" onclick="Approve('<%=Deshenpi.getId()%>',1)"></td>
            <td><input type="button" value="拒绝" onclick="Approve('<%=Deshenpi.getId()%>',-1)"></td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>
