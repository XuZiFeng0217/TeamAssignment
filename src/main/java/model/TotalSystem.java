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

        College college1 = new College("Engineer College","Database","Computer Network","Cloud Computing",4.0, 3.0, 2.0,"Information","Computer","Network","AI","Data Management","Application Design","Server Computing","System Analysis","Operation Research");
        College college2 = new College("Computer College","C Programme","Robotic","Operating System",4.0, 3.0, 2.0,"Math","Operation System","Mechine Learning","Computer Vision","Algorithm","Database Design","Logistic","NLP","UI design");
        College college3 = new College("Medical College", "Biology","Medician","Otology",4.0, 3.0, 2.0,"Medical research","Trement Room","Pharmacy","ICU","Operation Room","Emergency","Consulting","Infection","Nurse");
        College college4 = new College("Science College","Optic","Mechanics","Partical Physics",4.0, 3.0, 2.0,"Physic","Engineer","Building","Experiment","Atom","QED","Universe","Geography","Geothearme");
        College college5 = new College("Finance College","Money&Banking","International Finance", "Insurance",4.0, 3.0, 2.0,"Accounting","Budget","Capitalism","Competition","Comsumer Theory","Deduction","Banker","Enterpreneur","Cost Computing");

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
                course1.getTeacherList().add(teacher);
                course2.getTeacherList().add(teacher);
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
                //Course course3 = courseList.get(2);
                //Double gpa3 = faker.number().randomDouble(2, 2, 4);
                
                Student currentStudent = new Student(belongCollege,firstName,lastName,age,company,startSalary,currentSalary,
                        course1,course2,gpa1,gpa2);
                
                college.getStudentList().add(currentStudent);
                course1.getStudentList().add(currentStudent);
                course2.getStudentList().add(currentStudent);
                //course3.getStudentList().add(currentStudent);
                this.university.getStudentList().add(currentStudent);
            }
        }
    }
   
    public void generateSystem(){
        this.listCompanyList(5);
        this.addCollegeAndCourse();
        this.addTeacher();
        this.addStudent();
        this.university.updateCollegeList();
        }
    
    
    }
    

        
     
    
