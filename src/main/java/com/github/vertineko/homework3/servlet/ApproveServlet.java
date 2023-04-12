package com.github.vertineko.homework3.servlet;

import com.github.vertineko.homework3.service.CourseSevice;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ApproveServlet", value = "/ApproveServlet")
public class ApproveServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var num = request.getParameter("num");
        var temp = request.getParameter("flag");
        var flag = Integer.parseInt(temp);
        if(CourseSevice.getCourseSevice().getDeshenpiById(Integer.parseInt(num))==null){
            response.getWriter().print("{\"flag\":false}");
        }else {
            CourseSevice.getCourseSevice().updateDeshenpiStatus(Integer.parseInt(num),flag);
            response.getWriter().print("{\"flag\":true}");
        }
    }
}
