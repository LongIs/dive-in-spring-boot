package com.loong.diveinspringboot.Chapter1.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xiongtaolong
 * @date 2019-05-24 16:47
 * urlPatterns 映射地址
 */
@WebServlet(urlPatterns = "/my/servlet")
public class ServletTest extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().print("hello");
    }
}
