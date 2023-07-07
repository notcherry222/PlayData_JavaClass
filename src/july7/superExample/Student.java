package july7.superExample;

import java.awt.*;

public class Student extends People {
    public int studentNo;

    //생성자 alt+insert
    public Student(String name, String ssn, int studentNo) {
        super(name, ssn);
        this.studentNo = studentNo;
    }
}
