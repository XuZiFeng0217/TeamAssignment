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
    * @return students
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
    
        /**
     * 获取单独学生的每年平均涨薪
     * @param Student
     * @return double
     */
    //删除了Student类里的incrementRate与midSalary变量，比较整齐，输入模拟数据建Student时也只输入基础信息。
    public Double getAverageSalaryIncreament(Student student){
        Double startSalary = student.getStartSalary();
        Double currentSalary = student.getCurrentSalary();
        Double averageSalaryIncreament = (currentSalary - startSalary)/5;
        
        return averageSalaryIncreament;
    }
    
        /**
     * 某学院全部学生按照startSalary降序排序
     * @param college
     * @return List<Student>
     */
    public List<Student> rankByStartSalaryByCollege(College college){
        List<Student> students = college.getStudentList();
        Collections.sort(students,new Comparator<Student>(){
            @Override
            public int compare(Student stu1, Student stu2) {
                //升序
                return stu2.getStartSalary().compareTo(stu1.getStartSalary());
        }}
        );
        return students;
    }
    
    /**
     * 获取学习过某门课程所有学生的平均startSalary
     * @param course
     * @return Double
     */
    public Double getAverageStartSalaryByCourse(Course course){
        List<Student> students = course.getStudentList();
        double sum=0;
        for(Student stu : students){
            sum = sum + stu.getStartSalary();
        }
        return sum/students.size();
        
    }
    
        /**
     * 获取学习过某门课程所有学生的平均startSalary
     * @param course
     * @return Double
     */
    
    
}
