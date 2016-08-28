/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapterfour;

/**
 *
 * @author jorgecamargo
 */
public class Student {
    private String name;
    private double gpa;
    private Professor advisor;
    private String cc;
    
   /* public Student(String name){
        this.name = name;
        advisor = new Professor("Jorge Camargo","Computer Science");
    }*/
    Professor p= new Professor("Jorge camargo","Programacion orientada a objetos");
    
    private String getName(){
        return name;
    
    }
    private String setName(String name){
        return this.name=name;
    
    }
    
    private String getcc(){
    
        return cc;
    }
    private String setcc(String cc){
    
        return this.cc=cc;
    }
    private String getAdvisorsDepartment() {
        
        return advisor.getDepartment();  // a String expression
    }

    private void printAllAttributes() {
    System.out.println("Name:  " + this.getName());
    System.out.println("Student id:  "+this.cc);
    System.out.println("Professor:  "+this.p.name);
    System.out.println("Deparment:  "+this.p.getDepartment());
    /**
     * @param args the command line arguments
     */
    }

    public static void main(String[] args) {
        Student s = new Student();
       
       /* System.out.println("Student name: " + s.getName() 
                + ", Advisor department: " + s.getAdvisorsDepartment());*/
        s.setcc("1013665665");
        s.setName("Jose Alredo Lopez Arias");
        s.printAllAttributes();
        
    }
    
}
