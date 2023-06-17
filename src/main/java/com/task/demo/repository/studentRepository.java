package com.task.demo.repository;

import com.task.demo.exception.NotFoundException;
import com.task.demo.model.students;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class studentRepository {

    // Студенты
    private static final Map<Integer, students> STUDENT_REPOSITORY_MAP = new HashMap<>();

    // Переменная для генерации ID студента
    private static final AtomicInteger STUDENT_ID_HOLDER = new AtomicInteger();

    // Добавить студента
    @Override
    public void save(students student) throws NotFoundException {
        final int studentId = STUDENT_ID_HOLDER.incrementAndGet();
        STUDENT_REPOSITORY_MAP.put(studentId, student);
    }

    public Integer findById(Long studentId) {
        return 1; //!!!
    }

    // Все студенты
    @Override
    public List<students> findAll() {
        return new ArrayList<>();
    }
}
