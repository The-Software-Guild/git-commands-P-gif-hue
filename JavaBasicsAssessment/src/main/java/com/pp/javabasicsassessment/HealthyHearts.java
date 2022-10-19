/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pp.javabasicsassessment;
import java.util.Scanner;



public class HealthyHearts {
        
    public static void main( String[] args ) {
   
        Scanner input = new Scanner( System.in );
        int age;



       System.out.println( "Welcome to the Healthy Hearts scanner, please enter your age (years)");
        age = input.nextInt();




        System.out.println( "Maximum Heart Rate:"  + maxHeartRate(age) + "bpm.");
       
        System.out.println( "Your target heart rate zone between"  + " " + healthyLowerRange(maxHeartRate(age)) + " " + "and" + " " + healthyHigherRange(maxHeartRate(age)) + " " + "bpm.");
        
    }
        
    // Method //



   public static int maxHeartRate(int age){
        return 220 - age;
    }



   public static int healthyLowerRange (int maxHeartRate){
        return maxHeartRate/2;
    }
    public static int healthyHigherRange (int maxHeartRate){
        return (int)(maxHeartRate*0.85);
    }
}