/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritanceprj1;

/**
 *
 * @author ROTONDWA
 */
import java.util.Scanner;

public class InheritancePrj1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Developer dev = new Developer();
        Manager Man = new Manager();
       
        System.out.print("Enter your Employee name: ");
        dev.name = input.nextLine();
        System.out.print("Enter your salary: ");
        dev.salary = input.nextDouble();
        input.nextLine();
        System.out.print("Enter your Manager name: ");
        Man.name = input.nextLine();
        System.out.print("Enter your salary: ");
        Man.salary = input.nextDouble();
        input.nextLine();
        System.out.println("===============================================NOVATECH EMPLOYEE DATABASE================================================");
        System.out.println("EMPLOYEE name: "+ dev.name);
        System.out.println("SALARY: R"+ dev.salary);
        System.out.println("BONUS: R" + dev.calculateBonus());
        double totalEA = dev.salary + dev.calculateBonus();
        System.out.println("TOTAL AMOUNT: R"+ totalEA);
        System.out.println();
        System.out.println("MANAGER name: "+ Man.name);
        System.out.println("SALARY: R"+ Man.salary);
        System.out.println("BONUS: R" + Man.calculateBonus());
        double totalMA = Man.salary + Man.calculateBonus();
        System.out.println("TOTAL AMOUNT: R"+ totalMA);
        System.out.println("==========================================================================================================================");
        
        /*System.out.println("=====================================================POLYMORPHISM HERE==================================================");
        Employee[] workers = {dev , Man};
        for(int i = 0 ; i < workers.length ; i++){
            System.out.println(workers[i].calculateBonus());
        }*/
        
    }
}
