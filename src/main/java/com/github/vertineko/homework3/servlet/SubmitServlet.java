package com.github.vertineko.homework3.servlet;

import com.github.vertineko.homework3.model.deshenpi;
import com.github.vertineko.homework3.service.CourseSevice;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "SubmitServlet", value = "/SubmitServlet")
public class SubmitServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var num = request.getParameter("num");
        System.out.println(num);

        if(CourseSevice.getCourseSevice().getDeshenpiById(Integer.parseInt(num)) == null){

            var name = request.getParameter("name");
            deshenpi Deshenpi = new deshenpi(Integer.parseInt(num),name,0);
            CourseSevice.getCourseSevice().insertDeCourse(Deshenpi);
            response.getWriter().print("{\"flag\":true}");
        }else {
            response.getWriter().print("{\"flag\":false}");
        }


    }
}
