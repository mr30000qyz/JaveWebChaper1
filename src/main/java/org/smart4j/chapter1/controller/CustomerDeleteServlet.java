package org.smart4j.chapter1.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 删除客户
 */
@WebServlet("/customer_delete")
public class CustomerDeleteServlet extends HttpServlet {

    /**
     * 处理删除客户请求
     */
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // TODO
    }
}
