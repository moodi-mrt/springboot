package com.Example.CrudeStudentException.Service;

import com.Example.CrudeStudentException.Entity.Student;
import com.Example.CrudeStudentException.Repository.Repository;
import jakarta.validation.constraints.Null;
import org.springframework.http.ResponseEntity;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public class Service {

private Repository repository;


    public Service(Repository repository) {
        this.repository= repository;
    }

    public Student createStudent(Student student){
        return repository.save(student);

    }

    public Student getId(Long id){
        Optional<Student> resp = repository.findById(id);

        if (resp.isPresent()){
           resp.get();
        }
        return null;

}
    public List<Student> getAll(){
    return repository.findAll();

}
    public Student UpdateStudent(Long id, Student student){
        Optional<Student> existing = repository.findById(id);

        if (existing.isEmpty()){
           return  null;
        }

        Student studentreq = existing.get();

        student.setName(student.getName());
        student.setAge(student.getAge());
        student.setEmail(student.getEmail());
        student.setSubject(student.getSubject());

       return repository.save(studentreq);

    }

    public boolean DeleteStudent(Long id){
        Optional<Student> studentToBeDeleted = repository.findById(id);
        if (!repository.existsById(id)){
            return false;
        }
        repository.deleteById(id);
        return true;
    }


}
