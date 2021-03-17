/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;


/**
 *
 * @author 甄雨桐
 */
public class System {
    
    private University university = new University("Northeastern University", "Boston");
    private List<Company> companys;

    public University getUniversity() {
        return university;
    }

    public List<Company> getCompanys() {
        return companys;
    }
    
    public void addFakeInformation(){
        Faker faker = new Faker();
    }
    
}
