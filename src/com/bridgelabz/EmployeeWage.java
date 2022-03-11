package com.bridgelabz;

public class EmployeeWage {
    public static final int isPartTime = 1;
    public static final int isFullTime = 2;

    private String company;
    private int maxHoursInMonth;
    private int empRatePerHour;
    private int numberOfWorkingDays;

    public EmployeeWage(String company, int maxHoursInMonth, int empRatePerHour, int numberOfWorkingDays) {
        this.company = company;
        this.maxHoursInMonth = maxHoursInMonth;
        this.empRatePerHour = empRatePerHour;
        this.numberOfWorkingDays = numberOfWorkingDays;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getMaxHoursInMonth() {
        return maxHoursInMonth;
    }

    public void setMaxHoursInMonth(int maxHoursInMonth) {
        this.maxHoursInMonth = maxHoursInMonth;
    }

    public int getEmpRatePerHour() {
        return empRatePerHour;
    }

    public void setEmpRatePerHour(int empRatePerHour) {
        this.empRatePerHour = empRatePerHour;
    }

    public int getNumberOfWorkingDays() {
        return numberOfWorkingDays;
    }

    public void setNumberOfWorkingDays(int numberOfWorkingDays) {
        this.numberOfWorkingDays = numberOfWorkingDays;
    }

    @Override
    public String toString() {
        return "EmployeeWage{" +
                "company='" + company + '\'' +
                ", maxHoursInMonth=" + maxHoursInMonth +
                ", empRatePerHour=" + empRatePerHour +
                ", numberOfWorkingDays=" + numberOfWorkingDays +
                '}';
    }

}
