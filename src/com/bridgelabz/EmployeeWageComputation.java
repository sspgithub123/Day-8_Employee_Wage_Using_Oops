package com.bridgelabz;

public class EmployeeWageComputation {
    public static final int isPartTime = 1;
    public static final int isFullTime = 2;
    public static final int empRatePerHour = 20;
    public static final int nomOfWorkingDays = 20;
    public static final int maxHrsInMonth = 100;

    public static void main(String[] args) {
        EmployeeWageComputation object = new EmployeeWageComputation();
        object.Uc1();
        object.Uc2();
        object.Uc3();
        object.Uc4();
        object.Uc5();
        object.Uc6();
    }

    public void Uc1(){
        System.out.println("UC-1===============>");
        System.out.println("Welcome to Employee Wage Computation Program. ");
        int isFullTime = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == isFullTime)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
        System.out.println();
    }

    public void Uc2(){
        System.out.println("UC-2===============>");
    int isFullTime = 1;
    int empRatePerHour = 20;

    int empHrs = 0;
    int empWage = 0;
    double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == isFullTime)
    empHrs = 8;
        else
    empHrs = 0;
    empWage = empHrs * empRatePerHour;
        System.out.println("Emp Wage: " + empWage);
        System.out.println();

    }
    public void Uc3(){
        System.out.println("UC-3===============>");
    int isPartTime = 1;
    int isFullTime = 2;
    int empRatePerHour = 20;

    int empHrs = 0;
    int empWage = 0;

    double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == isPartTime)
    empHrs = 4;
        else if (empCheck == isFullTime)
    empHrs = 8;
        else
    empHrs = 0;
    empWage = empHrs * empRatePerHour;
        System.out.println("Emp Wage: " + empWage);
        System.out.println();

    }

    public void Uc4(){
        System.out.println("UC-4===============>");
        int empHrs = 0;
        int empWage = 0;

        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck)
        {
            case isPartTime:
                empHrs = 4;
                break;
            case isFullTime:
                empHrs = 8;
                break;
            default:
                empHrs = 0;
        }
        empWage = empHrs * empRatePerHour;
        System.out.println("Emp Wage: " + empWage);
        System.out.println();

    }

    public void Uc5(){
        System.out.println("UC-5===============>");
    int empHrs = 0;
    int empWage = 0;
    int totalEmpWage = 0;

        for (int day = 0; day < nomOfWorkingDays; day++) {
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case isPartTime:
                empHrs = 4;
                break;
            case isFullTime:
                empHrs = 8;
                break;
            default:
                empHrs = 0;
        }
        empWage = (empHrs * empRatePerHour);
        totalEmpWage += empWage;
        System.out.println("Emp Wage: " + empWage);
    }
        System.out.println("Total emp Wage: " + totalEmpWage);
        System.out.println();
    }

    public void Uc6(){
        System.out.println("UC-6===============>");
    int empHrs = 0;
    int totalEmpHrs = 0;
    int totalWorkingDays = 0;

        while (totalEmpHrs <= maxHrsInMonth && totalWorkingDays < nomOfWorkingDays)
    {
        totalWorkingDays++;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case isPartTime:
                empHrs = 4;
                break;
            case isFullTime:
                empHrs = 8;
                break;
            default:
                empHrs = 0;
        }
        totalEmpHrs += empHrs;
        System.out.println("Day#: " + totalWorkingDays + "EmpHr: " + empHrs);
    }
    int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total empWage: " + totalEmpWage);
    }
}

