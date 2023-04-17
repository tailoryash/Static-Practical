package com.yash.statickeyword.comapny;

public class Employee {
    public static String ceo;
    int empId;
    String empName;
    String dept;

    public Employee(int empId, String empName, String dept) {
        this.empId = empId;
        this.empName = empName;
        this.dept = dept;
    }

    static {
        ceo = "Prayaag Kasundra";
        System.out.println("CEO name added");
    }

    public static void show() {
        System.out.println("Welcome to Simform Family");
    }

    public void empDetails() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Employee dept : " + dept);
    }
}
