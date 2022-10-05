package com.akqa.aem.training.aem201.core.servlets;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.propertytypes.ServiceDescription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.Servlet;
import javax.servlet.http.Cookie;

@Component(service = { Servlet.class })
@SlingServletResourceTypes(
        resourceTypes="cq:Page",
        methods=HttpConstants.METHOD_POST,
        extensions="json")
@ServiceDescription("Login Servlet")
public class LoginServlet extends HttpServlet implements LoginServletInterface {

    private static final long serialVersionUID = 1L;
    final Logger logger = LoggerFactory.getLogger(getClass());


    protected void doPost(final SlingHttpServletRequest req,
                          final SlingHttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");


        String name = req.getParameter("name"); // fetch the username from login.html
        String password = req.getParameter("password"); // fetch the password from login.html


        if (password.equals("admin123")) {
            System.out.print("Welcome, " + name);
            HttpSession session = req.getSession();


            Cookie ck = new Cookie("name", name);//creating cookie object
            res.addCookie(ck);
            res.sendRedirect("/content/aem201/us/en/contact-us");
        } else {
            System.out.print("Sorry, username or password error!"); // For incorrect login
            req.getRequestDispatcher("login.html").include(req, res);
        }
        System.out.close();

    }
}


