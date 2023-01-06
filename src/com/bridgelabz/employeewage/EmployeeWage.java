package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {

        System.out.println("    WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM  ");

        int fullTime = 1;
        int partTime = 2;
        int empWagePerHour = 20;
        int empFullDayHours = 8;
        int empPartTimeHours = 4;
        int empWage = 0;
        double randomcheck = Math.floor(Math.random() * 10) % 3;

        if (randomcheck == fullTime) {
            System.out.println("Employee is Present for Full time");
            System.out.println("Employee`s Daily Wage is : " + empWagePerHour * empFullDayHours);

        } else if (randomcheck == partTime) {
            System.out.println("Employee is Present for Part time");
            System.out.println("Employee`s Daily Wage is : " + empWagePerHour * empPartTimeHours);

        } else {
            System.out.println("Employee is Absent");
        }

    }
}
