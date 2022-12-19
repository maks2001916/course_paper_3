package com.example.course_paper_3.Controller;

import com.example.course_paper_3.Service.QuestionService;
import com.example.course_paper_3.model.Question;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

public class JavaQuestionController {
    private QuestionService service;

    public JavaQuestionController(QuestionService service) {
        this.service = service;
    }

    @GetMapping("/exam/java/add?question=QuestionText&answer=QuestionAnswer")
    public Question addQuestion(@PathParam("QuestionText") String question, @PathParam("QuestionAnswer") String answer) {
        return service.add(question, answer);
    }

    @GetMapping("/exam/java")
    public Collection<Question> getQuestions() {
        return service.getAll();
    }

    @GetMapping("/exam/java/remove?question=QuestionText&answer=QuestionAnswer")
    public Question removeQuestion(@PathParam("QuestionText") String question, @PathParam("QuestionAnswer") String answer) {
        Question question1 = new Question(question, answer);
        return service.remove(question1);
    }
}
