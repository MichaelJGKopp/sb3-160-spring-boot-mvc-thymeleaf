package com.luv2code.springboot.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.http.HttpRequest;

@Controller
public class HelloWorldController {

    // create mapping for input form

    @RequestMapping("/showForm")
    public String showForm() {

        return "helloworld-form";
    }

    // create mapping for processing form

    @RequestMapping("/processForm")
    public String processForm() {

        return "helloworld";
    }

    // new controller method to read form data and add data to the model
    @RequestMapping("/processFormVersionTwo")
    public String toUpperCase(HttpServletRequest request, Model theModel) {

        String studentName = request.getParameter("studentName");
        System.out.println("studentName: " + studentName);

        theModel.addAttribute("studentNameUpperCase", studentName.toUpperCase());

        return "helloworld-version-two";
    }
}
