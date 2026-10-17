package org.example.Repository;


import org.example.Entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static tools.jackson.databind.cfg.CoercionInputShape.Array;

@Repository
public class StudentRepository {

    private Map<Long, Student> StudentDB;

    public StudentRepository(){
        StudentDB = new HashMap<>();
    }

    public Student Save(Student studentReq){
        StudentDB.put(studentReq.getId(), studentReq);
        return studentReq;
    }


    public Student FindByid(Long id){
        return StudentDB.get(id);
    }

    public List<Student> getAll(){
        new ArrayList<>(StudentDB.values());
    }
}
