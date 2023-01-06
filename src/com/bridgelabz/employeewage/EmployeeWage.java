package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {

        System.out.println("    WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM  ");

        int fullTime = 1;
        double randomcheck = Math.floor(Math.random() * 10) % 2;

        if(randomcheck == fullTime){
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is Absent");
        }

    }
}
