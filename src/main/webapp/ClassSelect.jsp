<%@ page import="java.util.List" %>
<%@ page import="com.github.vertineko.homework3.model.Course" %>
<%@ page import="java.io.InputStream" %>

<%@ page import="com.github.vertineko.homework3.dao.CourseDao" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.apache.ibatis.io.Resources" %>
<%@ page import="java.io.IOException" %>
<%@ page import="org.apache.ibatis.session.SqlSessionFactory" %>
<%@ page import="org.apache.ibatis.session.SqlSessionFactoryBuilder" %>
<%@ page import="org.apache.ibatis.session.SqlSession" %>
<%@ page import="com.github.vertineko.homework3.service.CourseSevice" %>
<%@ page import="com.github.vertineko.homework3.model.deshenpi" %><%--
  Created by IntelliJ IDEA.
  User: 11732
  Date: 2023/4/10
  Time: 16:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ClassSelect</title>
    <link type="text/css" rel="stylesheet" href="css/ClassSelect.css">
    <script type="text/javascript" src="js/ClassSelect.js"></script>
</head>
<body>
    <textfeild>
        <h1>选课列表</h1>
        <table id="course" border="0" >
            <tr>
                <th>id</th>
                <th>name</th>
                <th>action</th>

            </tr>
            <%
                List<Course> courses = CourseSevice.getCourseSevice().showAllCourse();
                for (Course course:courses) {
            %>

            <tr>
                <td><%=course.getId()%></td>
                <td><%=course.getName()%></td>
                <td><input type="button" value="申请" onclick="submit('<%=course.getId()%>','<%=course.getName()%>')"></td>
            </tr>

            <%
                }
            %>
            <tr>
                <td>&nbsp;</td>
                <td><input type="text" id="searchtext"></td>
                <td><input type="button" value="查询" onclick="search()"></td>
            </tr>

        </table>
    </textfeild>
    <hr/>
    <h1>已选列表</h1>
    <textfeild>

        <table id="deepish">
            <tr>
                <th>id</th>
                <th>name</th>
                <th>status</th>
                <th>action</th>
            </tr>

        <%
            List<deshenpi> decourses = CourseSevice.getCourseSevice().showAllDecourse();

            for(deshenpi Deshenpi: decourses){
                var status = "waiting";
                if(Deshenpi.getStatus() == 1){
                    status = "success";
                } else if (Deshenpi.getStatus() == -1) {
                    status = "failed";
                }

        %>
        <tr>
            <td><%=Deshenpi.getId()%></td>
            <td><%=Deshenpi.getName()%></td>
            <td><%=status%></td>
            <td><input type="button" value="删除" onclick="deleteRow(<%=Deshenpi.getId()%>)"><td>
        </tr>
        <%
            }
        %>
        </table>
    </textfeild>
    <hr/>
    <textfeild>
        <h1 class="h1">查询结果</h1>
        <table id="querydata">
        </table>
    </textfeild>
    <hr/>
</body>
</html>
