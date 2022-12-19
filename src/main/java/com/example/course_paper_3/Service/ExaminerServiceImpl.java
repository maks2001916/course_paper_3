package com.example.course_paper_3.Service;

import com.example.course_paper_3.model.Question;

import java.util.Collection;
import java.util.Random;

public class ExaminerServiceImpl implements ExaminerService{

    Random random = new Random();
    QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        return null;
    }
}
