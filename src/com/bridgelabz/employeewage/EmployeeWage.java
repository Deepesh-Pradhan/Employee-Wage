package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {

        System.out.println("    WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM  ");

        int fullTime = 1;
        int empWage_Per_Hour = 20;
        int empHours = 0;
        int empWage = 0;
        double randomcheck = Math.floor(Math.random() * 10) % 2;

        if(randomcheck == fullTime){
            System.out.println("Employee is Present");
           empHours = 8;
        }
        else {
            System.out.println("Employee is Absent");
            empHours = 0;
        }
        empWage = empWage_Per_Hour * empHours;
        System.out.println("Employee wage is : "+empWage);
    }
}
