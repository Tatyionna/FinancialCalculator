package com.pluralsight;
import java.util.Scanner;

public class MathApp {
    public static void main(String[] args) {
        // Question 1:
        // declare variables
        int bobSalary = 5000; int garySalary = 5500; int highestSalary;
        System.out.println(Math.max(bobSalary,garySalary));
        highestSalary = garySalary;
        // ex: System.out.println("The answer is " + answer);
        System.out.println("The highest Salary is Gary");
        // Question 2:
        double carPrice = 18599.99;
        double truckPrice = 34799.99;
        // code solution
        System.out.println(Math.min(carPrice, truckPrice));
        System.out.println("The smallest variable is carPrice");
        // Question 3:
        //declare variables
        double radius = 7.25;
        char A;
        double sumPi = 3.141592653589793238462643383279502884197;
                // calculate pi formula

        int id = 10135;
        String name = "Plymouth Plyers";
        float pay = 5239.77f;
        System.out.printf("%s (id: %d) $%.2f", name, id, pay);





    }
}
