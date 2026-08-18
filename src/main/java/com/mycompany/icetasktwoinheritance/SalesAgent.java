package com.mycompany.icetasktwoinheritance;

    public class SalesAgent extends Employee implements IVehicleDealer {
        private int vehiclesSold;
        private double comissionRate;
        
        public SalesAgent(String name, int employeeID, double baseSalary, int vehiclesSold, double comissionRate) {
         super(name, employeeID,baseSalary);
         this.vehiclesSold = vehiclesSold;
         this.comissionRate = comissionRate;
        }
        
        @Override
        public double calculateComission(){
            return vehiclesSold * comissionRate;
        }
        
        @Override
        public void generateQuote(){
            System.out.println("Vehicle quote generated for " + name);
        }
        
        public void printReport(){
            double comission = calculateComission();
            double totalEarnings = baseSalary + comission;
            
            System.out.println("=========================");
            System.out.println("Sales Agent Report");
            System.out.println("=========================");
            System.out.println("Agent  name: " + name);
            System.out.println("Employee ID: " + employeeID);
            System.out.println("Base Salary: " + baseSalary);
            System.out.println("Vehicles Sold: " + vehiclesSold);
            System.out.println("Comission Earnings: " + comission);
            System.out.println("Total Earnings: " + totalEarnings);
            
            if (comission > 10000){
                System.out.println("Top Seller!");   
            }
            
        }

        
    }
