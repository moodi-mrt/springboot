package org.example.StudentService;


import org.example.Entity.Student;
import org.example.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public Student Save(Student studentReq){
        studentRepository.Save(studentReq);
        return studentReq;
    }

    public Student getStudent(Long id){
       return studentRepository.FindByid(id);

    }

    public List<Student> GetAll(){
        return studentRepository.getAll();
    }

    public Student createStudent(Student studentReq) {
        return null;
    }
}
