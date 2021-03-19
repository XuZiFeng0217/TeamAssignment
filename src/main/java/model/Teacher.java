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
public class Teacher {
    private String firstName;
    private String lastName;
    private int age;
    private ArrayList<Course> courseList = new ArrayList<Course>();
    
    public Teacher(String firstName, String lastName, int age, Course course1, Course course2){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.courseList.add(course1);
        this.courseList.add(course2);
    }
    
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
    
    
}
