/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice;

/**
 *
 * @author henry
 */
import java.util.Scanner;
public class Employee {
    Scanner input = new Scanner(System.in);
    int salary;
    
    void salary(){
        System.out.println("Enter salary: ");
        salary = input.nextInt();
    }
}

class Programmer extends Employee{
    void bonus(){
        salary();
        double bonus;
        
        System.out.println("Enter bonus: ");
        bonus = input.nextDouble();
        System.out.println("Your Salary: " + salary);
        System.out.println("Your Bonus: " + bonus);
        System.out.println("Your Total Payment: " + (salary + bonus));
    }
    
    public static void main(String [] args){
        Programmer myObj = new Programmer();
        
        myObj.bonus();
    }
}
