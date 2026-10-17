package com.Example.CrudeStudentException.Controller;

import com.Example.CrudeStudentException.Entity.Student;
import com.Example.CrudeStudentException.Service.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@org.springframework.stereotype.Controller
public class Controller {
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student studentreq){
        Student created = service.createStudent(studentreq);

        return ResponseEntity.status(HttpStatus.CREATED).body(created);

    }
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudent(@RequestBody Long id){
        Student get = service.getId(id);

        return ResponseEntity.ok(get);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAll(){
        List<Student> get = service.getAll();

        return ResponseEntity.ok(get);

    }
    @PostMapping
    public ResponseEntity<Student> update(@RequestBody Student studentReq, Long id){
        Student updated = service.UpdateStudent(id,studentReq);

        return ResponseEntity.ok(updated);
    }


}
