package com.task.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "students")
public class students {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    private String student_name;

    @NotBlank
    private String specialization;

    @NotBlank
    private String age;

    public students(){
        super();
    }

    public students(Long id, String student_name, String specialization, String age) {
        super();
        this.id = id;
        this.student_name = student_name;
        this.specialization = specialization;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Integer getSpecialization() {
        return age;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
