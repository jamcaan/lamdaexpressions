package com.studentgradeapi.gradeapi.untilitycontainer;

import com.studentgradeapi.gradeapi.enity.Student;
import com.studentgradeapi.gradeapi.enums.Sex;
import org.springframework.stereotype.Component;

public class CheckEligibilty implements CheckStudent{

        @Override
        public boolean testEligible(Student s) {
            return s.getGender() == Sex.FEMALE
                    && s.getGrade() >= 2.5
                    && s.getGrade() <= 4.0;

        }


}
