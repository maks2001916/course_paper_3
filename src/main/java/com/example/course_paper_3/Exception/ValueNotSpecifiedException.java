package com.example.course_paper_3.Exception;

public class ValueNotSpecifiedException extends NullPointerException {
    public ValueNotSpecifiedException() {
    }

    public ValueNotSpecifiedException(String s) {
        super(s);
    }
}
