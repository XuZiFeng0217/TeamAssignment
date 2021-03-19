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
public class Course {
    private String name;
    private ArrayList<Teacher> teacherList = new ArrayList<>();
    private ArrayList<Student> studentList = new ArrayList<>();
    private Double credit;
    //private List<String> relatedField;
    //考虑是否加学分，给学生算totalGPA用
    
    public Course(String name,Double credit){
        this.name = name;
        this.credit = credit;
    }
            
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(ArrayList<Teacher> teacherList) {
        this.teacherList = teacherList;
    }



    

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return name;
    }
    
    

    
    
    
}
