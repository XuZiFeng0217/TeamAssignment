/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Collections;
import java.util.List;
import java.util.*;
import javax.naming.spi.DirStateFactory.Result;

/**
 *
 * @author xzf
 */
public class Utils {
        /**
    * 全部学生按照totalGpa降序排序
    * @param college
    * @return students
    */
    public List<Student> rankByTotalGpa(List<Student> students){
        Collections.sort(students,new Comparator<Student>(){
            @Override
            public int compare(Student stu1, Student stu2) {
                
                return stu2.getTotalGpa().compareTo(stu1.getTotalGpa());
        }}
        );
        return students;
    }
    
            /**
     * List全部学生按照CurrentSalary降序排序
     * @param college
     * @return 
     */
    public List<Student> rankByCurrentSalary(List<Student> students){
        
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
        ArrayList<Student> students = course.getStudentList();
        double sum=0;
        for(Student stu : students){
            sum = sum + stu.getCurrentSalary();
        }
        return sum/students.size();
        
    }
    
    /**
     * 获取学习过某门课程所有学生的平均IncrementRate
     * @param course
     * @return 
     */
    public Double getAverageIncrementRateByCourse(Course course){
        ArrayList<Student> students = course.getStudentList();
        double sum=0;
        for(Student stu : students){
            sum = sum + (stu.getCurrentSalary()- stu.getStartSalary())/(5*stu.getStartSalary());
        }
        return sum/students.size()*100;
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
    public ArrayList<Course> RankCurrentSalaryByCourse(ArrayList<Course> courses){
        Utils utils = new Utils();
        Collections.sort(courses,new Comparator<Course>(){
            @Override
            public int compare(Course course1, Course course2) {
                //升序
                return utils.getAverageCurrentSalaryByCourse(course2).compareTo(utils.getAverageCurrentSalaryByCourse(course1));
        }}
        );
        return courses;
        

    }
    
    /**
     * 获取List<Student>里所有学生GPA与startSalary的关系
     * @param List<Student>
     * @return Double[]
     */
    public String getRelationshipBetweenGpaAndStartsalary(List<Student> students){
        relationshipGpaSalary model = new relationshipGpaSalary(students);
        model.validateCoefficients();
        Double[] result = new Double[3];
        
        //返回3个Double数，第一个为回归方程系数，第二个为常数，第三个为统计里的R方（拟合优度）越接近1相关性越大
        result[0] =Double.valueOf(String.valueOf(model.getA1()));
        result[1] = Double.valueOf(String.valueOf(model.getA0()));
        result[2] = model.getR();
        
        
        return  "y = " + result[0] + "x + " + result[1];
    }
    
        /**
     * 获取List<Student>里所有学生GPA与startSalary的关系
     * @param List<Student>
     * @return Double[]
     */
    public String getRelationshipBetweenGpaAndStartsalary1(List<Student> students){
        relationshipGpaSalary model = new relationshipGpaSalary(students);
        model.validateCoefficients();
        Double[] result = new Double[3];
        
        //返回3个Double数，第一个为回归方程系数，第二个为常数，第三个为统计里的R方（拟合优度）越接近1相关性越大
        result[0] =Double.valueOf(String.valueOf(model.getA1()));
        result[1] = Double.valueOf(String.valueOf(model.getA0()));
        result[2] = model.getR();
        
        
        return  result[2]+"";
    }
    
    public List<Student> rankByRate(List<Student> students){
        Collections.sort(students,new Comparator<Student>(){
            @Override
            public int compare(Student stu1, Student stu2) {

                return getAverageSalaryIncreament(stu2).compareTo(getAverageSalaryIncreament(stu1));
                
        }}
        );
        return students;
    }
    
}
