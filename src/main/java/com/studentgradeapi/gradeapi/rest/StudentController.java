package com.studentgradeapi.gradeapi.rest;

import com.studentgradeapi.gradeapi.enity.Student;
import com.studentgradeapi.gradeapi.enums.Sex;
import com.studentgradeapi.gradeapi.studentservice.StudentService;
import com.studentgradeapi.gradeapi.untilitycontainer.CheckStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.HttpStatus.OK;

@RestController
@RequestMapping ("/students/api/v1/")
public class StudentController {

    private StudentService studentService;
    List<Student> studentList = Student.createStudents();

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

//
//    @GetMapping("/student")
//    public ResponseEntity<List<Student>> getEligibleStudents(){
//        //Using user defined Functional Interface and Anonymous class
//        return new ResponseEntity<List<Student>>(
//                studentService.displayStudent(new CheckStudent() {
//            @Override
//            public boolean testEligible(Student s) {
//                return s.getGender() == Sex.FEMALE
//                        && s.getGrade() >= 2.5
//                        && s.getGrade()<= 4.0;
//            }
//        }), HttpStatus.OK);
//    }
//    @GetMapping("/student")
//    public ResponseEntity<List<Student>> getEligibleStudents(){
//        // Using Lambda expression instead of abstract method
//        return new ResponseEntity<List<Student>>(studentService.displayStudent(
//                (Student s)->
//                s.getGender() == Sex.FEMALE
//                        && s.getGrade() >= 2.5
//                        && s.getGrade() <= 4.0
//
//        ), HttpStatus.OK);
//    }
//    @GetMapping("/student")
//    public ResponseEntity<List<Student>> getEligibleStudents(){
//        // Using JDK defined functional interface Predicate<T> instead of CheckStudent
//        return new ResponseEntity<List<Student>>(studentService.displayStudentWithPredicate(
//                s-> s.getGender() == Sex.FEMALE
//                        && s.getGrade() >= 2.5
//                        && s.getGrade() <= 4.0
//
//        ), HttpStatus.OK);
//    }


    @GetMapping("/student")
    public ResponseEntity getEligibleStudents(){
        //Using aggregate operations
        return new ResponseEntity(studentList.stream()
                    .filter(
                            s -> s.getGender() == Sex.FEMALE
                            && s.getGrade() >= 2.5
                            && s.getGrade() <= 4.0
                    ), OK);

    }

}
