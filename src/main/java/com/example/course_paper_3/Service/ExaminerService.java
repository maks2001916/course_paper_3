package com.example.course_paper_3.Service;

import com.example.course_paper_3.model.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestions(int amount);

}
