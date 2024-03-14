/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practic1_6;

/**
 *
 * @author Erm
 */
public class Seller {
    public void modify(Telephone telephone){
        String newManufacturer = telephone.getManufacturer().replace("o", "a");
        if (!((newManufacturer.startsWith("N")) || (newManufacturer.startsWith("n")))){
            newManufacturer = newManufacturer.toLowerCase();
        }
        telephone.setManufacturer(newManufacturer);
        
    }
}

