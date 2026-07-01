import java.util.Scanner;

// Base Class
class Employee {
    protected String name;
    protected double baseSalary;

    // Constructor
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Method to calculate salary
    public double calculateSalary() {
        return baseSalary;
    }
}

// Derived Class
class Manager extends Employee {
    private double bonus;

    // Constructor
    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);   // Initialize inherited properties
        this.bonus = bonus;
    }

    // Overriding method
    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Employee Input
        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Employee Base Salary: ");
        double empSalary = sc.nextDouble();
        sc.nextLine();

        Employee emp = new Employee(empName, empSalary);

        // Manager Input
        System.out.print("Enter Manager Name: ");
        String mgrName = sc.nextLine();

        System.out.print("Enter Manager Base Salary: ");
        double mgrSalary = sc.nextDouble();

        System.out.print("Enter Manager Bonus: ");
        double bonus = sc.nextDouble();

        Manager mgr = new Manager(mgrName, mgrSalary, bonus);

        // Output
        System.out.println(emp.calculateSalary());
        System.out.println(mgr.calculateSalary());

        sc.close();
    }
}