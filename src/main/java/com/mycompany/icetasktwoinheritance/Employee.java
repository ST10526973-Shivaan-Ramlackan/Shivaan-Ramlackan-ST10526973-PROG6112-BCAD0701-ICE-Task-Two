package com.mycompany.icetasktwoinheritance;

public abstract class Employee {
         protected String name;
        protected int employeeID;
        protected double baseSalary;
        
        public Employee(String name, int employeeID, double baseSalary)
        {
         this.name = name;
         this.employeeID = employeeID;
         this.baseSalary = baseSalary;
        }
        public abstract double calculateComission();  
}
