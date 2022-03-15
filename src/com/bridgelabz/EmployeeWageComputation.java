package com.bridgelabz;

public class EmployeeWageComputation {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUMBER_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;

    public static void main(String[] args) {
        EmployeeWageComputation object = new EmployeeWageComputation();
        object.attendance();
        object.dailyWage();
        object.partTime();
        object.switchCase();
        object.wageForMonth();
        object.conditionalWage();
        object.computeEmployeeWage();
    }

    public void attendance() {
        System.out.println("Attendance-1===============>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Welcome to Employee Wage Computation Program. ");
        int isFullTime = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == isFullTime)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
        System.out.println();
    }

    public void dailyWage() {
        System.out.println("dailyWage-2===============>>>>>>>>>>>>>>>>>>>>>>>>");
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == IS_FULL_TIME)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage: " + empWage);
        System.out.println();
    }

    public void partTime() {
        System.out.println("partTime-3===============>>>>>>>>>>>>>>>>>>>>>>>>>>");
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == IS_PART_TIME)
            empHrs = 4;
        else if (empCheck == IS_FULL_TIME)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage: " + empWage);
        System.out.println();
    }

    public void switchCase() {
        System.out.println("switchCase-4===============>>>>>>>>>>>>>>>>>>>>>>>>");
        int empHrs = 0;
        int empWage = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case IS_PART_TIME:
                empHrs = 4;
                break;
            case IS_FULL_TIME:
                empHrs = 8;
                break;
            default:
                empHrs = 0;
        }
        empWage = empHrs * EMP_RATE_PER_HOUR;
        System.out.println("Emp Wage: " + empWage);
        System.out.println();
    }

    public void wageForMonth() {
        System.out.println("wageForMonth-5===============>>>>>>>>>>>>>>>>>>>>>>");
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;

        for (int day = 0; day < NUMBER_OF_WORKING_DAYS; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = (empHrs * EMP_RATE_PER_HOUR);
            totalEmpWage += empWage;
            System.out.println("Emp Wage: " + empWage);
        }
        System.out.println("Total emp Wage: " + totalEmpWage);
        System.out.println();
    }

    public void conditionalWage() {
        System.out.println("conditionalWage-6===============>>>>>>>>>>>>>>>>>>>>>");
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUMBER_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#: " + totalWorkingDays + "EmpHr: " + empHrs);
        }
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total empWage: " + totalEmpWage);
        System.out.println();
    }

    public void computeEmployeeWage() {
        System.out.println("computeEmployeeWage-7===============>>>>>>>>>>>>>>>>>>>>>>>");
        int workingHr = 0;
        int totalWorkingHrs = 0;
        int monthlyTotalWage = 0;

        int[] daily_wage_array = new int[20];
        for (int i = 0; i < NUMBER_OF_WORKING_DAYS && totalWorkingHrs < EMP_RATE_PER_HOUR; i++) {
            int emp_check = (int) (Math.floor(Math.random() * 10)) % 3;
            switch (emp_check) {
                case 1:
                    workingHr = 8;
                    break;
                case 2:
                    workingHr = 4;
                    break;
                default:
                    workingHr = 0;
            }
            totalWorkingHrs += workingHr;
            daily_wage_array[i] = workingHr * EMP_RATE_PER_HOUR;
        }
        for (int j = 0; j < NUMBER_OF_WORKING_DAYS; j++) {
            int day = j + 1;
            System.out.println("Day " + day + " wage is " + daily_wage_array[j]);
            monthlyTotalWage = monthlyTotalWage + daily_wage_array[j];
        }
        System.out.println("\nMonthly wage is " + monthlyTotalWage);
    }
}

