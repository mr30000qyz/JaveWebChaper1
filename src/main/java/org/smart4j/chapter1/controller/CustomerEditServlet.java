package org.smart4j.chapter1.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 编辑客户
 */
@WebServlet("/customer_edit")
public class CustomerEditServlet extends HttpServlet {

    /**
     * 进入编辑客户界面
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // TODO
    }

    /**
     * 处理编辑客户请求
     */
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // TODO
    }
}
