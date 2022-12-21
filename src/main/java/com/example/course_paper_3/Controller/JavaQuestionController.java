package com.example.course_paper_3.Controller;

import com.example.course_paper_3.Service.QuestionService;
import com.example.course_paper_3.model.Question;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping
public class JavaQuestionController {
    private QuestionService service;

    public JavaQuestionController(QuestionService service) {
        this.service = service;
    }

    @GetMapping("/exam/java/add")
    public Question addQuestion(@RequestParam("Question") String question, @RequestParam("Answer") String answer) {
        return service.add(question, answer);
    }

    @GetMapping("/exam/java")
    public Collection<Question> getQuestions() {
        return service.getAll();
    }

    @GetMapping("/exam/java/remove")
    public Question removeQuestion(@RequestParam("Question") String question, @RequestParam("Answer") String answer) {
        Question question1 = new Question(question, answer);
        return service.remove(question1);
    }
}
