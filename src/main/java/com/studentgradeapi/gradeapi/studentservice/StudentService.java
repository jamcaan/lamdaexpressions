package com.studentgradeapi.gradeapi.studentservice;

import com.studentgradeapi.gradeapi.enity.Student;
import com.studentgradeapi.gradeapi.untilitycontainer.CheckStudent;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public interface StudentService {

    List<Student> displayStudent(CheckStudent test);
    List<Student> displayStudentWithPredicate(Predicate<Student> test);

}
