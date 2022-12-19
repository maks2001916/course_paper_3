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

import java.util.ArrayList;
import java.util.Collection;

@ExtendWith(MockitoExtension.class)
public class JavaQuestionServiceTest {


        Question question1 = new Question("q1", "a1");
        Question question2 = new Question("q2", "a2");
        Question question3 = new Question("q3", "q4");

        @Mock
        private JavaQuestionService javaQuestionService;

        @BeforeEach
        public void completion() {
            javaQuestionService = new JavaQuestionService();
        }

        @Test
        public void gettingAnExistingQuestion() {
            javaQuestionService.add(question1);
            javaQuestionService.add(question2);
            javaQuestionService.add(question3);
            Collection<Question> questionCollection = new ArrayList<>();
            questionCollection.add(question1);
            questionCollection.add(question2);
            questionCollection.add(question3);
            Assertions.assertEquals(javaQuestionService, questionCollection);
        }


    }


