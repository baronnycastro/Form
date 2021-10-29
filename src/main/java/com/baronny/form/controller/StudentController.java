package com.baronny.form.controller;

import javax.validation.Valid;

import com.baronny.form.dto.Student;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    
    @GetMapping("/")
    public String getForm(Student student){
        return "index";
    }

    @PostMapping("/save-student")
    public String detalhesEstudante(@Valid Student student, Errors errors, Model model){

    if (null != errors && errors.getErrorCount() > 0){
        return "index";
    } else {
        model.addAttribute("sucessMsg", "Salvo com sucesso");
        return "sucess";
    }
    }
}
