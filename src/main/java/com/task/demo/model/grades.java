package com.task.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "grades")
public class grades {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String student_name;

    @NotBlank
    private String subject;

    @NotBlank
    private String grade;

    public grades(){
        super();
    }

    public grades(Long id, String student_name, String specialization, String subject, String grade) {
        super();
        this.id = id;
        this.student_name = student_name;
        this.subject = subject;
        this.grade = grade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
