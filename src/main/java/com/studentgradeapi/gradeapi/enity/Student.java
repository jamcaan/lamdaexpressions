package com.studentgradeapi.gradeapi.enity;

import com.studentgradeapi.gradeapi.enums.Sex;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.List;

public class Student {


        private Long id;
        private String name;
        private String lastName;
        //    @JsonFormat(pattern="yyyy-MM-dd")
        private LocalDate birthday;
        private String department;
        private Float grade;
        private String email;
        private Sex gender;



    public Student(Long id, String name, String lastName, LocalDate birthday, String department, Float grade, String email, Sex gender) {
            this.id = id;
            this.name = name;
            this.lastName = lastName;
            this.birthday = birthday;
            this.department = department;
            this.grade = grade;
            this.email = email;
            this.gender = gender;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public LocalDate getBirthday() {
            return birthday;
        }

        public void setBirthday(LocalDate birthday) {
            this.birthday = birthday;
        }

        public String getDepartment() {
            return department;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public Float getGrade() {
            return grade;
        }

        public void setGrade(Float grade) {
            this.grade = grade;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public Sex getGender() {
            return gender;
        }

        public void setGender(Sex gender) {
            this.gender = gender;
        }

    public static int compareByAge(Student a, Student b){
        return a.birthday.compareTo(b.birthday);
    }


    public int getAge(){
        return birthday
                .until(IsoChronology.INSTANCE.dateNow())
                .getYears();
    }


    public void displayStudent(){
        this.getAge();
    }


        public static List<Student> createStudents(){
            List<Student> student = new ArrayList<>();
            student.add( new Student(
                    1L,
                    "Mohamed",
                    "Jama",
                    IsoChronology.INSTANCE.date(1992, 11, 22),
                    "business",
                    3.0F,
                    "jama@gmail.com",
                    Sex.MALE
            ));

            student.add( new Student(
                    2L,
                    "James",
                    "Smith",
                    IsoChronology.INSTANCE.date(1994, 5, 15),
                    "IT",
                    4.0F,
                    "james@gmail.com",
                    Sex.MALE
            ));

            student.add( new Student(
                    3L,
                    "Donna",
                    "Reed",
                    IsoChronology.INSTANCE.date(1997, 2, 18),
                    "IT",
                    2.9F,
                    "donna@gmail.com",
                    Sex.FEMALE
            ));

            student.add( new Student(
                    4L,
                    "Jennifer",
                    "Brown",
                    IsoChronology.INSTANCE.date(1999, 1, 28),
                    "HISTORY",
                    3.3F,
                    "jennifer@gmail.com",
                    Sex.FEMALE
            ));

            student.add( new Student(
                    5L,
                    "Mike",
                    "White",
                    IsoChronology.INSTANCE.date(1994, 8, 13),
                    "HEALTH",
                    2.5F,
                    "mike@gmail.com",
                    Sex.MALE
            ));

            student.add( new Student(
                    6L,
                    "Chris",
                    "Black",
                    IsoChronology.INSTANCE.date(1993, 4, 21),
                    "IT",
                    4.0F,
                    "chris@gmail.com",
                    Sex.MALE
            ));


            return student;


        }








}



