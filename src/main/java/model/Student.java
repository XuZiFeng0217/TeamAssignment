/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author zzz
 */
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private Company company;
    private Double startSalary;
    private Double currentSalary;
    private ArrayList<Course> courseList = new ArrayList<>();
    private Map<Course,Double> gpa = new HashMap<>();
    private Double totalGpa;
    private String college; 
    
    public Student(String college, String firstName, String lastName, int age, Company company, 
            Double startSalary, Double currentSalary,Course course1, Course course2, 
            Double gpa1, Double gpa2){
        
                this.college = college;
                this.firstName = firstName;
                this.lastName = lastName;
                this.age = age;
                this.company = company;
                this.startSalary = startSalary;
                this.currentSalary = currentSalary;
                this.courseList.add(course1);
                this.courseList.add(course2);
                //this.courseList.add(course3);
                
                this.gpa.put(course1, gpa1);
                this.gpa.put(course2, gpa2);
                //this.gpa.put(course3, gpa3);
                
        
    }
    
    public Student(){}
    
    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
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

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Double getStartSalary() {
        return startSalary;
    }

    public void setStartSalary(Double startSalary) {
        this.startSalary = startSalary;
    }

    public Double getCurrentSalary() {
        return currentSalary;
    }

    public void setCurrentSalary(Double currentSalary) {
        this.currentSalary = currentSalary;
    }


    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    public Map<Course, Double> getGpa() {
        return gpa;
    }

    public void setGpa(Map<Course, Double> gpa) {
        this.gpa = gpa;
    }

    public Double getTotalGpa() {
        Double totalCredit = 0.0;
        Double totalGpa = 0.0;
        for(Entry<Course,Double> entry:gpa.entrySet()){
            totalCredit += entry.getKey().getCredit();
            totalGpa += (entry.getValue() * entry.getKey().getCredit());
        }
        this.totalGpa = totalGpa/totalCredit;
        return this.totalGpa;
    }

    public void setTotalGpa(Double totalGpa) {
        this.totalGpa = totalGpa;
    }
}
