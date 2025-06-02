package in.sachin.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sachin.entity.Student;
import in.sachin.exception.StudentNotFoundException;
import in.sachin.repo.StudentRepository;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
 
 @Autowired
 private StudentRepository repository;

 @Override
 public List<Student> getAllStudents() {
     return repository.findAll();
 }

 @Override
 public Student getStudentById(Long id) {
     return repository.findById(id)
             .orElseThrow(() -> new StudentNotFoundException("Student not found with id: " + id));
 }

 @Override
 public Student saveStudent(Student student) {
     return repository.save(student);
 }

 @Override
 public Student updateStudent(Long id, Student updatedStudent) {
     Student student = getStudentById(id);
     student.setName(updatedStudent.getName());
     student.setEmail(updatedStudent.getEmail());
     student.setCourse(updatedStudent.getCourse());
     return repository.save(student);
 }

 @Override
 public void deleteStudent(Long id) {
     repository.deleteById(id);
 }
}

