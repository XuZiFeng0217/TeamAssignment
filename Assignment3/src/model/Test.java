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
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        Student s6 = new Student();
        s1.setTotalGpa(3.18);
        s2.setTotalGpa(3.66);
        s3.setTotalGpa(3.22);
        s4.setTotalGpa(3.45);
        s5.setTotalGpa(2.98);
        s6.setTotalGpa(3.44);
        s1.setStartSalary(125.6);
        s2.setStartSalary(520.6);
        s3.setStartSalary(754.0);
        s4.setStartSalary(1240.0);
        s5.setStartSalary(942.0);
        s6.setStartSalary(1846.0);
        College c1 = new College();
        List<Student> students  = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        /*
        c1.setStudentList(students);
        util.rankByCurrentSalaryByCollege(c1);
        for(Student stu : c1.getStudentList()){
            System.out.println(stu.getCurrentSalary());
        }
        
        Course c2 = new Course();
        c2.setStudentList(students);
        */
        
        Double[] result = util.getRelationshipBetweenGpaAndStartsalary(students);
        System.out.println("\n回归线公式:  y = " + result[0] + "x + " + result[1]);  
        System.out.println("误差： R^2 = " + result[2]);  
        
        //System.out.println(util.getAverageCurrentSalaryByCourse(c2));
        
    }
    
}
