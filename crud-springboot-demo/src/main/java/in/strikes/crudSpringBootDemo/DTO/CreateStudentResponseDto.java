package in.strikes.crudSpringBootDemo.DTO;

import org.springframework.format.annotation.DateTimeFormat;

public class CreateStudentResponseDto {
    private long id;
    private long name;
    private int age;
    private String email;
    private int rollNo;
    private String subject;
    private String message;
    DateTimeFormat createdAt;
    DateTimeFormat updatedAt;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getName() {
        return name;
    }

    public void setName(long name) {
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public DateTimeFormat getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(DateTimeFormat createdAt) {
        this.createdAt = createdAt;
    }

    public DateTimeFormat getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(DateTimeFormat updatedAt) {
        this.updatedAt = updatedAt;
    }
}
