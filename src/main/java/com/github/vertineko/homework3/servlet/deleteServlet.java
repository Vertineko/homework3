package com.github.vertineko.homework3.servlet;

import com.github.vertineko.homework3.service.CourseSevice;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "deleteServlet", value = "/deleteServlet")
public class deleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        var num = request.getParameter("num");
        CourseSevice.getCourseSevice().deleteDeshenpi(Integer.parseInt(num));

    }
}
