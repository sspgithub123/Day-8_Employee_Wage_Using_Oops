package com.bridgelabz;

import java.util.ArrayList;

interface empWageBuilder {
    public void computeEmpWage( companyEmpWage obj );
}
class empWageOops implements empWageBuilder {
    final int IS_PART_TIME = 1;
    final int IS_FULL_TIME = 2;

    public void computeEmpWage(companyEmpWage companyEmpWage) {
        int empHrs = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        int totalEmpWage = 0;
        while (totalWorkingDays < companyEmpWage.getNumOfWorkingDays() && totalEmpHrs <=  companyEmpWage.getMaxHoursPerMonth()) {

            int empCheck = (int) ((Math.random() * 10) % 3);
            switch (empCheck) {
                case IS_PART_TIME:
                    // System.out.println("Employee is Present");
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    // System.out.println("Employee is Present");
                    empHrs = 8;
                    break;
                default:
                    // System.out.println("Employee is Absent");
                    empHrs = 0;
            }
            totalWorkingDays++;
            totalEmpHrs = totalEmpHrs + empHrs;
        }
        companyEmpWage.setTotalEmpWage( totalEmpHrs * companyEmpWage.empRatePerHour );
        System.out.println("Employee Monthly Wage of " + companyEmpWage.getCompanyName() + " is " + companyEmpWage.getTotalEmpWage());
    }
    //Main Function
    public static void main(String[] args) {
        System.out.println("WELCOME to EMPLOYEE WAGE Computation");
        empWageOops emp = new empWageOops();
        //ArrayList of Multiple Companies Wage

        ArrayList<companyEmpWage> company = new ArrayList<companyEmpWage>();
        // assign value to object of Companyempwage
        company.add( new companyEmpWage("Dmart", 40, 20, 100));
        emp.computeEmpWage(company.get(0));
        company.add( new companyEmpWage("Relience", 30, 22, 120));
        emp.computeEmpWage(company.get(1));
        company.add( new companyEmpWage("BigBazar", 45, 18, 90));
        emp.computeEmpWage(company.get(2));
    }
}

class companyEmpWage {

    public String companyName = " ";
    public int empRatePerHour = 0;
    public int numOfWorkingDays = 0;
    public int maxHoursPerMonth = 0;
    public int totalEmpWage = 0;

    public companyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    //GETTERS method to get variables
    public String getCompanyName() {
        return companyName;
    }

    public int getEmpRatePerHour() {
        return empRatePerHour;
    }

    public int getNumOfWorkingDays() {
        return numOfWorkingDays;
    }

    public int getMaxHoursPerMonth() {
        return maxHoursPerMonth;
    }

    public void setTotalEmpWage(int totalEmpWage) {
        this.totalEmpWage = totalEmpWage;
    }

    public int getTotalEmpWage() {
        return totalEmpWage;
    }
}