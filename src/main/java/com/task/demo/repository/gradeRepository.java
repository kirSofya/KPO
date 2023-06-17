package com.task.demo.repository;

import com.task.demo.exception.NotFoundException;
import com.task.demo.model.grades;

import java.util.HashMap;
import java.util.Map;

@Service
public class gradeRepository {

    // Оценки
    private static final Map<Integer, Integer> GRADES_REPOSITORY_MAP = new HashMap<>();

    // Выставить оценку
    @Override
    public void save(grades grade) throws NotFoundException {
        final int studentId = Math.toIntExact(grade.getId());
        GRADES_REPOSITORY_MAP.put(studentId, studentId);
    }

    // Получить оценку
    @Override
    public Integer findById(int id) {
        return GRADES_REPOSITORY_MAP.get(id);
    }
}

