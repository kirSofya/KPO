package com.task.demo.repository;

import com.task.demo.exception.NotFoundException;
import com.task.demo.model.grades;
import com.task.demo.model.students;
import java.util.HashMap;
import java.util.Map;

@Service
public class gradeRepository {

    // Оценки
    private static final Map<Integer, students> GRADES_REPOSITORY_MAP = new HashMap<>();

    // Выставить оценку
    @Override
    public void save(grades grade) throws NotFoundException {
        final int studentId = Math.toIntExact(grade.getId());
        GRADES_REPOSITORY_MAP.put(studentId, grade.getSubject());
    }

    // Получить оценку
    @Override
    public grades findById(int id) {
        return GRADES_REPOSITORY_MAP.get(id);
    }
}

