package com.example.course_paper_3.Service;

import com.example.course_paper_3.Exception.ThereIsNoSuchObjectException;
import com.example.course_paper_3.model.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService{

    Random random = new Random();
    QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount <= 0 || amount > questionService.getAll().size()) {
            throw new ThereIsNoSuchObjectException();
        }
        Set<Question> questionCollection = new HashSet<>();
        for (int i = 0; i < amount; i++) {
            questionCollection.add(questionService.getRandomQuestion());
        }
        return questionCollection;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExaminerServiceImpl that = (ExaminerServiceImpl) o;
        return Objects.equals(random, that.random) && Objects.equals(questionService, that.questionService);
    }

    @Override
    public int hashCode() {
        return Objects.hash(random, questionService);
    }

    @Override
    public String toString() {
        return "ExaminerServiceImpl{" +
                "random=" + random +
                ", questionService=" + questionService +
                '}';
    }
}
