package com.akqa.aem.training.aem201.core.servlets;

import com.day.cq.commons.jcr.JcrConstants;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.propertytypes.ServiceDescription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jcr.Node;
import javax.jcr.Session;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.Servlet;
import javax.servlet.http.Cookie;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;

@Component(service = { Servlet.class })
@SlingServletResourceTypes(
        resourceTypes="cq:Page",
        methods=HttpConstants.METHOD_POST,
        selectors = "login.add",
        extensions="html")

@ServiceDescription("Login Servlet")
public class LoginServlet extends SlingAllMethodsServlet   {

    private static final long serialVersionUID = 1L;
    //public static String test = "";
    final Logger logger = LoggerFactory.getLogger(getClass());
    private static final  String basePath = "/content/aem201/us/en/login/jcr:content/root/container/container/login_1694020700";

    @Override
    protected void doPost(final SlingHttpServletRequest req,
                          final SlingHttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");


        String name = req.getParameter("name"); // fetch the username from login.html
        String password = req.getParameter("password");
        final Resource resource = req.getResource();
        Session session = resource.getResourceResolver().adaptTo(javax.jcr.Session.class);
        try{
            if (Objects.nonNull(session) && session.nodeExists(basePath)) {  //Replacing Structure data with fetch data
                final Node node = session.getNode(basePath);
                String namenode =node.getProperty(name).getString();
                if (password.equals(namenode)) {

                    Cookie ck = new Cookie("name", name);//creating cookie object
                    res.addCookie(ck);


                    res.sendRedirect("/content/aem201/us/en/contact-us.html");

                } else {


                    res.sendRedirect("/content/aem201/us/en/contact-us/login-page.html");

                }
            }
        }
        catch(Exception e){
                log(e.getMessage());
            }








    }
}






