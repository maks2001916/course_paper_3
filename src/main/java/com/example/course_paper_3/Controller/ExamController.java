package com.example.course_paper_3.Controller;

import com.example.course_paper_3.Service.ExaminerServiceImpl;
import com.example.course_paper_3.model.Question;

import java.util.ArrayList;
import java.util.Collection;

public class ExamController {
    ExaminerServiceImpl examinerService;
    public Collection<Question> getQuestions(int amount) {
        return examinerService.getQuestions(amount);
    }
}
