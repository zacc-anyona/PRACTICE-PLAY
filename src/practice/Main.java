/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author henry
 */
public class Main {
    int EmpNo;
    double salary;
    String name;
    
    void Main (int x, String y, double z){
    EmpNo = x;
    salary = z;
    name = y;
}
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Employee NO: " + EmpNo);
        System.out.println("Salary: " + salary);
    }
    public static void main (String [] args){
        Main myObj = new Main();
        
        myObj.Main(1204, "Zacc", 200000);
        myObj.display();
    }
}
