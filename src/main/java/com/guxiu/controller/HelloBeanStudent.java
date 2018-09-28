package com.guxiu.controller;

import com.guxiu.bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloBeanStudent {

    @RequestMapping("/helloStudent")
    public String hello(Model model) {
        Student s = new Student();
        s.setId("111");
        s.setName("guxiu");
        model.addAttribute("student", s);
        return"helloStudent";
    }
}
