package com.studentgradeapi.gradeapi.studentservice.studentserviceImp;
import com.studentgradeapi.gradeapi.enity.Student;
import com.studentgradeapi.gradeapi.studentservice.StudentService;
import com.studentgradeapi.gradeapi.untilitycontainer.CheckStudent;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class StudentServiceImp implements StudentService {

    List<Student> studentList = Student.createStudents();

    @Override
    public List<Student> displayStudent(CheckStudent test) {
        List<Student> list = new ArrayList<>();
        for(Student s : studentList){
            if(test.testEligible(s)){
                list.add(s);
            }
        }
        return list;
    }


    @Override
    public List<Student> displayStudentWithPredicate(Predicate<Student> test) {
        List<Student> list = new ArrayList<>();
        for(Student s : studentList){
            if(test.test(s)){
                list.add(s);
            }
        }
        return list;
    }



}
