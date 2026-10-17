
package in.strikes.crudSpringBootDemo.DTO;

import jakarta.validation.constraints.*;

public class CreateStudentRequestDto {
    @NotBlank(message =" Name cannot be empty null or blank")
    @Size(min = 10 , max = 50 , message = "student name must be atleast 10 characters")
    private String name;

    @NotNull(message = "Age can't be null")
    @Min(message = "Student age atleast be 18", value = 18)
    private int age;

    @NotBlank(message = "the email should not be blank, empty/null or spaces")
    @Email(message = "Email must be valid")
    private String email;

    @NotNull(message = "Student roll number is required")
    private int rollNo;

    @NotBlank(message = "Subject is required")
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

    public int getRoll_no() {
        return rollNo;
    }

    public void setRoll_no(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
