/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practic1_6;
import java.util.Scanner;
/**
 *
 * @author Erm
 */
public class Practic1_6 {

    public static void main(String[] args) {
        System.out.println("Practical task 1.6, Ермошин Николай РИБО-03-22, Вариант 2");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название производителя телефона");
        String manufacturer = scanner.nextLine();
        Telephone telephone = new Telephone(manufacturer);
        Seller seller = new Seller();
        seller.modify(telephone);
        System.out.println("Название производителя: " + manufacturer);
        System.out.println("Изменёное название производителя: " + telephone.getManufacturer());
    }
}
