package com.yash.statickeyword;

import com.yash.statickeyword.comapny.Employee;

public class Main {
    public static void main(String[] args) {
        Employee.show();
        Employee emp1 = new Employee(1010, "Yash Tailor", "Java");
        System.out.println("CEO : " + Employee.ceo);
        emp1.empDetails();
    }
}