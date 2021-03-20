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
public class University {
    private String name;
    private String address;
    private ArrayList<College> collegeList = new ArrayList<>();
    private ArrayList<Student> studentList = new ArrayList<>();
    private ArrayList<Course> courseList = new ArrayList<>();
    
    public University(String name, String address){
        this.name = name;
        this.address = address;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<College> getCollegeList() {
        return collegeList;
    }

    public void setCollegeList(ArrayList<College> collegeList) {
        this.collegeList = collegeList;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }
    
    
    
    
    public void updateCollegeList(){
        for (College college : this.collegeList){
            for (Course course: college.getCourseList()){
                courseList.add(course);
            }
        }
    }
    
    
}
