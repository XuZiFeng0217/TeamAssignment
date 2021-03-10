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
public class Test {
    
    public static void main(String[] args) {
        
        
        Utils util = new Utils();
        Student s1 = new Student();
        Student s2 = new Student();
        s1.setTotalGpa(3.18);
        s2.setTotalGpa(3.66);
        s1.setCurrentSalary(125.6);
        s2.setCurrentSalary(520.6);
        College c1 = new College();
        List<Student> students  = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        c1.setStudentList(students);
        util.rankByCurrentSalaryByCollege(c1);
        for(Student stu : c1.getStudentList()){
            System.out.println(stu.getCurrentSalary());
        }
        
        Course c2 = new Course();
        c2.setStudentList(students);
        
        System.out.println(util.getAverageCurrentSalaryByCourse(c2));
        
    }
    
}
