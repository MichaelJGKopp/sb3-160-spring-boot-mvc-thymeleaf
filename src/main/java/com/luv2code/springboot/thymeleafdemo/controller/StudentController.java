package com.luv2code.springboot.thymeleafdemo.controller;

import com.luv2code.springboot.thymeleafdemo.model.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Value("${countries}")
    private List<String> countries;

    @Value("${programmingLanguages}")
    private List<String> programmingLanguages;

    @Value("${operatingSystems}")
    private List<String> operatingSystems;

    @GetMapping("/showStudentForm")
    public String studentForm(Model model) {

        model.addAttribute("student",
                new Student("Tim", "Buchalka", "Germany",
                        "Python", "Linux"));

        model.addAttribute("countries", countries);
        model.addAttribute("programmingLanguages", programmingLanguages);
        model.addAttribute("operatingSystems", operatingSystems);

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute("student") Student student) {

        System.out.println(student);

        return "student-confirmation";
    }


}
