/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inheritanceprj1;

/**
 *
 * @author ROTONDWA
 */

class Developer extends Employee{ 
    @Override
    double calculateBonus(){
        Bonus =  (salary*(0.10));
        return Bonus;
    }
}
