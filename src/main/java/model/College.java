/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zzz
 */
public class College {
    private String name;
    private ArrayList<Student> studentList = new ArrayList<Student>();
    private ArrayList<Course> courseList = new ArrayList<>();
    private ArrayList<Teacher> teacherList = new ArrayList<>();
    
    public College(){}

    public College(String name,String courseName1, String courseName2, String courseName3, Double credit1, Double credit2, Double credit3,
            String field1, String field2,String field3,String field4,String field5,String field6,String field7,String field8,String field9){
        
        Course course1 = new Course(courseName1, credit1, name, field1, field2 ,field3);
        Course course2 = new Course(courseName2, credit2, name, field4, field5, field6);
        Course course3 = new Course(courseName3, credit3, name, field7, field8, field9);

        this.courseList.add(course1);
        this.courseList.add(course2);
        this.courseList.add(course3);
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public ArrayList<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(ArrayList<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
    
    
}
