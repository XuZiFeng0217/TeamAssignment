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
    public static void main(String[] args) throws Exception {
        TotalSystem total = new TotalSystem();
        total.generateSystem();
        
        for(Company company: total.getCompanys()){
            System.out.println(company.getName());
        } System.out.println("--------------------------------------------------");
        
        for(Student student:total.getUniversity().getStudentList()){
            System.out.println(student.getFirstName());
        }System.out.println("-------------------------------------------------------");
        
        for(College college: total.getUniversity().getCollegeList()){
            System.out.println(college.getName());
            for(Teacher teacher: college.getTeacherList()){
                System.out.print(teacher.getFirstName() + ", Teacher");
                System.out.println();
            }
            for(Course course: college.getCourseList()){
                System.out.print(course.getName());
                System.out.println();
            }
            for(Student student: college.getStudentList()){
                System.out.print(student.getTotalGpa());
                System.out.println();
            }
            System.out.println("------------------------------------------------------");
         
//        Utils utils = new Utils();
//        Double[] result = utils.getRelationshipBetweenGpaAndStartsalary(total.getUniversity().getStudentList());
//        System.out.println("\n回归线公式:  y = " + result[0] + "x + " + result[1]);  
//        System.out.println("误差： R^2 = " + result[2]);  
            
        }
        }
    
}
