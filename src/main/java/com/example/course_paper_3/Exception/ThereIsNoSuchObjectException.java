package com.example.course_paper_3.Exception;


public class ThereIsNoSuchObjectException extends RuntimeException{
    public ThereIsNoSuchObjectException() {
    }

    public ThereIsNoSuchObjectException(String message) {
        super(message);
    }
}
