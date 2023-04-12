package com.github.vertineko.homework3.servlet;

import com.github.vertineko.homework3.service.CourseSevice;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ClassSelectServlet", value = "/ClassSelectServlet")
public class SearchServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var name = request.getParameter("name");
        if(CourseSevice.getCourseSevice().getCourseByName(name) == null){
            response.getWriter().print("{\"flag\": false }");
        }else {
            var course = CourseSevice.getCourseSevice().getCourseByName(name);
            response.getWriter().print("{\"num\":\"  "+ course.getId() +" \" , \"name\":\""+ course.getName()+"\",\"flag\": true}");
        }
    }
}
