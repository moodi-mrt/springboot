package com.example.crude_students.Service;

import com.example.crude_students.Entity.Student;
import com.example.crude_students.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    StudentRepository studentRepository;

public StudentService(StudentRepository studentRepository ){
    this.studentRepository = studentRepository;
    }

    public Student CreateStudent(Student StudentReq){
        Student studentResp = studentRepository.save(StudentReq);
        return  studentResp;
    }

    public Student getStudent(Long id){
    Optional<Student> studentResp = studentRepository.findById(id);

    if (studentResp.isPresent()) {
            return studentResp.get();
        }
        return  null;
    }

    public List<Student> getAll(){
    List<Student> studentResp = studentRepository.findAll();
    return studentResp;
    }

    public Student updateStudent(Long id, Student student){
    Optional<Student> studentResp = studentRepository.findById(id);
    if (studentResp.isEmpty()){
        return  null;
    }
    Student studentToSave = studentResp.get();

    studentToSave.setName(student.getName());
    studentToSave.setAge(student.getAge());
    studentToSave.setEmail(student.getEmail());
    studentToSave.setRoll_no(student.getRoll_no());
    studentToSave.setSubject(student.getSubject());

    return studentRepository.save(studentToSave);
    }

    public Boolean deleteStudent(Long  id){
    Boolean isStudent = studentRepository.existsById(id);

    if (!isStudent){
        return  false;
    }
    studentRepository.deleteById(id);
    return true;

    }
}
