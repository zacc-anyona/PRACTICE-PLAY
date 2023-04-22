/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice;

/**
 *
 * @author Anyona Zaddock
 */
import java.util.Scanner;
class Student {
    
}

public class Practice {
    int num = 1;
    String name; int memNo;
    void display (){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter member name: ");
        name = input.next();
        System.out.println("Enter member number: ");
        num = input.nextInt();
        
        System.out.println("Confirm your details below:");
        System.out.println("MEMBER NAME: " + name);
        System.out.println("MEMBER NUMBER: " + num);
    }
    /**
     * @param args the command line arguments
     */
    int i = 0;
    public static void main(String[] args) {
       /* int x = 0;
        while (x <= 5){//print "I am zacc!" x5
            System.out.println("I am zacc!");
            x++;
            
        }*/
        /*Practice myObj = new Practice();
        for (int y = myObj.i; y <= 5; y++){//print "I am zacc!" x5
            System.out.println("I am redd!");
        }*/
        
        /*Student newObj = new Student();
        int z = newObj.num;
        
        while (z <= 5){
            System.out.println("I love you Redd!");
            z++;
        }*/
        
        Practice obj = new Practice();
        obj.display();
    }
    
}
