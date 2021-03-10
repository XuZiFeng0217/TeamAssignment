/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Collections;
import java.util.List;
import java.util.*;

/**
 *
 * @author xzf
 */
public class Utils {
    
   /**
    * 某学院全部学生按照totalGpa降序排序
    * @param college
    * @return 
    */
    public List<Student> rankByTotalGpaByCollege(College college){
        List<Student> students = college.getStudentList();
        Collections.sort(students,new Comparator<Student>(){
            @Override
            public int compare(Student stu1, Student stu2) {
                //升序
                return stu2.getTotalGpa().compareTo(stu1.getTotalGpa());
        }}
        );
        return students;
    }
    
    /**
     * 某学院全部学生按照CurrentSalary降序排序
     * @param college
     * @return 
     */
    public List<Student> rankByCurrentSalaryByCollege(College college){
        List<Student> students = college.getStudentList();
        Collections.sort(students,new Comparator<Student>(){
            @Override
            public int compare(Student stu1, Student stu2) {
                //升序
                return stu2.getCurrentSalary().compareTo(stu1.getCurrentSalary());
        }}
        );
        return students;
    }
    
    /**
     * 获取学习过某门课程所有学生的平均currentSalary
     * @param course
     * @return 
     */
    public Double getAverageCurrentSalaryByCourse(Course course){
        List<Student> students = course.getStudentList();
        double sum=0;
        for(Student stu : students){
            sum = sum + stu.getCurrentSalary();
        }
        return sum/students.size();
        
    }
    
    
}
