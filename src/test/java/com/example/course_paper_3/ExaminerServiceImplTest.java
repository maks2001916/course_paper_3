package com.example.course_paper_3;

import com.example.course_paper_3.Service.ExaminerServiceImpl;
import com.example.course_paper_3.Service.JavaQuestionService;
import com.example.course_paper_3.model.Question;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceImplTest {

    Question question1 = new Question("q1", "a1");
    Question question2 = new Question("q2", "a2");
    Question question3 = new Question("q3", "q4");

    @Mock
    private ExaminerServiceImpl examinerService;
    private JavaQuestionService javaQuestionService;

    @BeforeEach
    public void completion() {
        javaQuestionService = new JavaQuestionService();
        examinerService = new ExaminerServiceImpl(javaQuestionService);
    }

    @Test
    public void gettingAnExistingQuestion() {
        javaQuestionService.add(question1);

    }

    @Test
    public void errorWhenGoingOutOfBounds() {
        Assertions.assertThrows(examinerService.getQuestions(4))
    }
}
