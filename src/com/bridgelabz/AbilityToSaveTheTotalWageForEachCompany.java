package com.bridgelabz;

public class AbilityToSaveTheTotalWageForEachCompany {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;

    public AbilityToSaveTheTotalWageForEachCompany(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void computeEmpWage() {
        System.out.println("Welcome To Employee Wage Computation");
        // Variables
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        // Computation
        while (totalEmpHrs <= maxHoursPerMonth &&
                totalWorkingDays < numOfWorkingDays) {
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
            System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " + empHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHour;
    }
    public String toString() {
        return "Total Emp Wage for Company:"  +company+" is: " + totalEmpWage;
    }

    public static void main(String[] args) {
        AbilityToSaveTheTotalWageForEachCompany dMart = new AbilityToSaveTheTotalWageForEachCompany("DMart", 200, 2, 10);
        AbilityToSaveTheTotalWageForEachCompany bigBazaar = new AbilityToSaveTheTotalWageForEachCompany("BigBazaar", 150, 4, 20);
        dMart.computeEmpWage();
        System.out.println(dMart);
        bigBazaar.computeEmpWage();
        System.out.println(bigBazaar);
    }
}
