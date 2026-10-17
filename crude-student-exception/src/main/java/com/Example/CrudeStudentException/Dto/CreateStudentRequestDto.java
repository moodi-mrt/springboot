package com.Example.CrudeStudentException.Dto;

import jakarta.validation.constraints.*;

public class CreateStudentRequestDto {
    @NotBlank(message = "name can't be null/empty or blank")
    @Size(min = 8 , max = 20, message = "name cann't be greater the 20 charcters or less then 8 charcaters")
    private String name;
    @NotNull(message = "Age can't be Null")
    @Min(value = 18, message = "age can't be less then 18")
    private int age;
    @NotBlank(message = "Email cann't be null/empyt or blank")
    @Email(message = "Email must be valid")
    private String email;
    @NotNull(message = "Roll number is required")
    private int rollNo;

    @NotNull(message = "Subject is required")
    private String subject;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
