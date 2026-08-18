package com.mycompany.icetasktwoinheritance;

public class ICETaskTwoInheritance {
 
    public static void main(String[] args) {
        
        SalesAgent agent1 = new SalesAgent(
        "Shivaan Ramlackan",
        101,
        15000,
        20,
        600);
        
        SalesAgent agent2 = new SalesAgent(
        "Aashish Maharaj",
        104,
        1500,
        10,
        800);
        
        SalesAgent agent3 = new SalesAgent(
        "Taheer Singh",
        102,
        16000,
        25,
        700);
        
        agent1.printReport();
        agent2.printReport();
        agent3.printReport();
        
        agent1.generateQuote();
        
    }
}
