/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package model;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


/**
 *
 * @author 甄雨桐
 */
public class TotalSystem {
    
    private University university = new University("Northeastern University", "Boston");
    private ArrayList<Company> companys = new ArrayList<Company>();
    private static Faker faker = new Faker();
    Random r = new Random();

    public University getUniversity() {
        return university;
    }
    
    public List<Company> getCompanys() {
        return companys;
    }
    
    
    private void listCompanyList(final int number) {
        //生成公司列表
        for(int i=0; i<number;i++){
            this.companys.add(new Company(faker.company().name().toString(), faker.address().fullAddress().toString()));
        } 
    }
    
    private void addCollegeAndCourse(){

        College college1 = new College("Engineer College","Database","Computer Network","Cloud Computing",4.0, 3.0, 2.0);
        College college2 = new College("Computer College","C Programme","Robotic","Operating System",4.0, 3.0, 2.0);
        College college3 = new College("Medical College", "Biology","Medician","Otology",4.0, 3.0, 2.0);
        College college4 = new College("Science College","Optic","Mechanics","Partical Physics",4.0, 3.0, 2.0);
        College college5 = new College("Finance College","Money&Banking","International Finance", "Insurance",4.0, 3.0, 2.0);

        this.university.getCollegeList().add(college1);
        this.university.getCollegeList().add(college2);
        this.university.getCollegeList().add(college3);
        this.university.getCollegeList().add(college4);
        this.university.getCollegeList().add(college5);
    }
    
    private void addTeacher(){
        for (College college : this.university.getCollegeList()){
            ArrayList<Course> courseList = new ArrayList<Course>(college.getCourseList());
            for (int i=0; i<10;i++){
                String firstName = faker.name().firstName();
                String lastName = faker.name().lastName();
                int age = faker.number().numberBetween(30, 60);
                Collections.shuffle(courseList);
                Course course1 = courseList.get(0);
                Course course2 = courseList.get(1);
                
                Teacher teacher = new Teacher(firstName,lastName,age,course1,course2);
                college.getTeacherList().add(teacher);
                
        }
        }
    }
    
    private void addStudent(){
        for (College college : this.university.getCollegeList()){
            ArrayList<Course> courseList = new ArrayList<Course>(college.getCourseList());
            for(int i=0;i<10;i++){
                String firstName = faker.name().firstName();
                String lastName = faker.name().lastName();
                int age = faker.number().numberBetween(30, 60);
                Company company = this.companys.get(r.nextInt(companys.size()));
                Double startSalary = faker.number().randomDouble(2, 4000, 9000);
                Double currentSalary = faker.number().randomDouble(2, 1000, 10000) + startSalary;
                String belongCollege = college.getName();
                
                Collections.shuffle(courseList);
                Course course1 = courseList.get(0);
                Double gpa1 = faker.number().randomDouble(2, 2, 4);
                Course course2 = courseList.get(1);
                Double gpa2 = faker.number().randomDouble(2, 2, 4);
                Course course3 = courseList.get(2);
                Double gpa3 = faker.number().randomDouble(2, 2, 4);
                
                Student currentStudent = new Student(firstName,lastName,belongCollege,age,company,startSalary,currentSalary,
                        course1,course2,course3,gpa1,gpa2,gpa3);
                
                college.getStudentList().add(currentStudent);
                this.university.getStudentList().add(currentStudent);
            }
        }
    }
   
    public void generateSystem(){
        this.listCompanyList(5);
        this.addCollegeAndCourse();
        this.addTeacher();
        this.addStudent();
        }
    
    
    }
    

        
     
    
