package com.example.course_paper_3.Controller;

import com.example.course_paper_3.Service.ExaminerServiceImpl;
import com.example.course_paper_3.model.Question;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;

@RestController
public class ExamController {
    private ExaminerServiceImpl examinerService;

    @GetMapping("/exam/get")
    public Collection<Question> getQuestions(@RequestParam("amount") int amount) {
        return examinerService.getQuestions(amount);
    }
}
