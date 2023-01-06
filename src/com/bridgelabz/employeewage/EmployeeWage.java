package com.bridgelabz.employeewage;

import java.util.Random;

public class EmployeeWage {

    static int empWagePerHour = 20;
    static int empFullDayHours = 8;
    static int empPartTimeHours = 4;
    static int workingDayPerMonth = 20;

    public static void main(String[] args) {

        System.out.println("    WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM  ");
        int totalWage = 0;
        int dayCount = 0;
        while (dayCount <= workingDayPerMonth) {
            Random ran = new Random();
            int attendance = ran.nextInt(3);
            int employeeWage = 0;
            switch (attendance) {
                case 1 -> {
                    System.out.println("Employee is Present for Full time");
                    employeeWage = empWagePerHour * empFullDayHours;
                }
                case 2 -> {
                    System.out.println("Employee is Present for Part time");
                    employeeWage = empWagePerHour * empPartTimeHours;
                }
                default -> System.out.println("Employee is Absent");
            }
            totalWage += employeeWage;
            System.out.println("Employee Wage for day "+dayCount+" is "+employeeWage);
            dayCount++;
        }
        System.out.println("Total Wage of Employee is "+totalWage);
    }
}

