/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author zzz
 */
public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private University university;
    private Company company;
    private Double startSalary;
    private Double currentSalary;
    private List<Course> courseList;
    private List<Map<Course,Double>> gpa;
    private Double totalGpa;

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


    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
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

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public List<Map<Course, Double>> getGpa() {
        return gpa;
    }

    public void setGpa(List<Map<Course, Double>> gpa) {
        this.gpa = gpa;
    }

    public Double getTotalGpa() {
        return totalGpa;
    }

    public void setTotalGpa(Double totalGpa) {
        this.totalGpa = totalGpa;
    }
}
