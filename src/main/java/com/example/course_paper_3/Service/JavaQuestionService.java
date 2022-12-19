package com.example.course_paper_3.Service;

import com.example.course_paper_3.Exception.ValueNotSpecifiedException;
import com.example.course_paper_3.model.Question;

import java.util.*;

public class JavaQuestionService implements QuestionService{

    private Set<Question> questions = new HashSet<>();

    private Random random = new Random();

    @Override
    public Question add(String question, String answer) {
        checkingForNotNullString(question);
        checkingForNotNullString(answer);
        Question createdQuestion = new Question(question, answer);
        questions.add(createdQuestion);
        return createdQuestion;
    }

    @Override
    public Question add(Question question) {
        checkingForNotNullQuestions(question);
            questions.add(question);
            return question;

    }

    @Override
    public Question remove(Question question1) {
        checkingForNotNullQuestions(question1);
        questions.remove(question1);
        return question1;
    }

    @Override
    public Collection<Question> getAll() {
        Collection<Question> collection = new ArrayList<>();
        collection.addAll(questions);
        return collection;
    }

    @Override
    public Question getRandomQuestion() {
        ArrayList<Question> arrayList = new ArrayList<>();
        arrayList.addAll(questions);
        return arrayList.get(random.nextInt(questions.size()));
    }

    private Question checkingForNotNullQuestions(Question question) {
        if (question == null) {
            throw new ValueNotSpecifiedException();
        } else {
            return question;
        }
    }

    private String checkingForNotNullString(String string) {
        if (string == null) {
            throw new ValueNotSpecifiedException();
        } else {
            return string;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaQuestionService that = (JavaQuestionService) o;
        return Objects.equals(questions, that.questions) && Objects.equals(random, that.random);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questions, random);
    }

    @Override
    public String toString() {
        return "JavaQuestionService{" +
                "questions=" + questions +
                ", random=" + random +
                '}';
    }
}
