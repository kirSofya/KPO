package com.task.demo.controller;

import com.task.demo.exception.NotFoundException;
import com.task.demo.model.grades;
import com.task.demo.model.students;
import com.task.demo.repository.studentRepository;
import com.task.demo.repository.gradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.List;


@RestController
public class studentController {

    @Autowired
    studentRepository studentRepository;

    @Autowired
    gradeRepository gradeRepository;

    // Получить список студентов
    @GetMapping("GET /students")
    public List getAllNotes() {
        return studentRepository.findAll();
    }

    // Добавить студента
    @PutMapping("/students/{studentId}")
    public students updateNote(@PathVariable(value = "studentId") Long studentId,
                               @RequestBody students details) throws NotFoundException {

        students student = studentRepository.findById(studentId)
                .orElseThrow(() -> new NotFoundException(studentId));

        students.setStudent_name(details.getStudent_name());
        students.setSpecialization(details.getSpecialization());
        students.setAge(details.getAge());

        students updatedStudent = studentRepository.save(student);
        return updatedStudent;
    }

    // Получить оценку по id
    @GetMapping("GET /grades /{studentId}")
    public grades getNoteById(@PathVariable(value = "studentId") Long studentId) throws NotFoundException {
        return gradeRepository.findById(studentId)
                .orElseThrow(() -> new NotFoundException(studentId));
    }

    // Выставить оценку
    @PostMapping("POST /grades")
    public grades createNote(@RequestBody grades grade) {
        return gradeRepository.save(grade);
    }
}
