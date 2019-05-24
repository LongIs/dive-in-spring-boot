package com.loong.diveinspringboot.Chapter1.web.servlet;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author xiongtaolong
 * @date 2019-05-24 17:25
 * asyncSupported 是否支持异步
 */
@WebServlet(urlPatterns = "/my/synServlet",asyncSupported=true)
public class SynServletTest extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        AsyncContext asyncContext = req.startAsync();
        asyncContext.start(() ->{
            try {
                Thread.sleep(10000);

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        resp.getWriter().println("Syn,hello");
        asyncContext.complete();
    }
}
