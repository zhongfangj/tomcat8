package com.test;

import javax.servlet.*;
import java.io.IOException;

public class TestServlectNew implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        System.out.println(req.getInputStream());
        System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxx");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
