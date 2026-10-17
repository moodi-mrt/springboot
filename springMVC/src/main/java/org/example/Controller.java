package org.example;


import org.example.Entity.Student;
import org.example.StudentService.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class Controller {

    private StudentService studentService;
            public Controller(StudentService studentService){
        this.studentService = studentService;
            }

            @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student studentReq){
                Student studentResp = studentService.Save(studentReq);
                return ResponseEntity.ok(studentResp);
            }

            @GetMapping("/{id}")
    public ResponseEntity<Student> GetStudent(@PathVariable Long id){
                Student Resp = studentService.getStudent(id);

                if (Resp == null){
                    return ResponseEntity.notFound().build();
                }
                return ResponseEntity.ok(Resp);
            }

            @GetMapping
    public ResponseEntity<List<Student>> getAll(){
                List<Student> Resp = studentService.GetAll();

                return ResponseEntity.ok(Resp);
            }
}
