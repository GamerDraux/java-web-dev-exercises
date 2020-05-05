package org.launchcode.java.exercises.Chapter4.School;

import org.launchcode.java.demos.lsn4classes2.Teacher;

import java.util.ArrayList;

public class Course {
    private ArrayList<Student> studentList;
    private Teacher teacher;
    private int credits;

    public Course (ArrayList<Student> studentList,
                   Teacher teacher, int credits){
        this.studentList=studentList;
        this.teacher=teacher;
        this.credits= credits;
    }

    public Course (ArrayList<Student> studentList,
                   Teacher teacher){
        this(studentList, teacher,0);
    }

}
