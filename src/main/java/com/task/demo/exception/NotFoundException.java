package com.task.demo.exception;

public class NotFoundException extends Exception {
    private long student_id;

    public NotFoundException(long student_id) {
        super(String.format("Student with id : '%s' is not found", student_id));
    }
}
