package com.bridgelabz.employeewage;

public class EmployeeWage {

    static int empWagePerHour = 20;
    static int empFullDayHours = 8;
    static int empPartTimeHours = 4;

    public static void main(String[] args) {

        System.out.println("    WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM  ");


        int randomcheck = (int) Math.floor(Math.random() * 10) % 3;


        switch (randomcheck) {
            case 1 -> {
                System.out.println("Employee is Present for Full time");
                System.out.println("Employee`s Daily Wage is : " + empWagePerHour * empFullDayHours);
            }
            case 2 -> {
                System.out.println("Employee is Present for Part time");
                System.out.println("Employee`s Daily Wage is : " + empWagePerHour * empPartTimeHours);
            }
            default -> System.out.println("Employee is Absent");
        }
        }
    }

