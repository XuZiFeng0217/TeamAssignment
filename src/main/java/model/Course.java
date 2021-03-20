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
    private ArrayList<String> relatedField = new ArrayList<>();
    private String college;

    public List<String> getRelatedField() {
        return relatedField;
    }

    public void setRelatedField(ArrayList<String> relatedField) {
        this.relatedField = relatedField;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
    
    
    public Course(String name,Double credit, String college, String field1, String field2, String field3){
        this.name = name;
        this.credit = credit;
        this.college = college;
        this.relatedField.add(field1);
        this.relatedField.add(field2);
        this.relatedField.add(field3);
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
