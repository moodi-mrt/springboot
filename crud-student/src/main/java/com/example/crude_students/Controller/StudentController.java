package com.example.crude_students.Controller;

import com.example.crude_students.Entity.Student;
import com.example.crude_students.Service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/student")
public class StudentController {
    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

 @PostMapping("/create")
    public ResponseEntity<Student> CreateStudent(@RequestBody Student student){
        Student CreateStudent = studentService.CreateStudent(student);

     return ResponseEntity
             .status(HttpStatus.CREATED)
             .body(CreateStudent);
 }

 @GetMapping("/get")
    public ResponseEntity<Student> getStudent(@RequestParam Long id){
     Student  studentResp = studentService.getStudent(id);

     if (studentResp == null){
         return ResponseEntity.notFound().build();
     }
     return ResponseEntity.ok(studentResp);
 }

 @GetMapping("/all")
    public ResponseEntity<List<Student>> getAll(){
        List<Student> studentRespon = studentService.getAll();

        if (studentRespon.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(studentRespon);
 }

 @PutMapping
  public ResponseEntity<Student>  updateStudent(@RequestParam Long id, @RequestBody Student student){
        Student studentResp = studentService.updateStudent(id, student);

        if (studentResp == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(studentResp);
 }

 @DeleteMapping
  public ResponseEntity<String> deleteStudent(@RequestParam Long id){
        Boolean StudentResp = studentService.deleteStudent(id);

        if (!StudentResp){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok("Records Deleted");
 }

}
