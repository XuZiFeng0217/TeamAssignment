/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;

/**
 *
 * @author zzz
 */
public class Course {
    private String name;
    private List<Teacher> teacherList;
    private List<Student> studentList;
    private List<String> relatedField;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }



    

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<String> getRelatedField() {
        return relatedField;
    }

    public void setRelatedField(List<String> relatedField) {
        this.relatedField = relatedField;
    }
    
    
}
