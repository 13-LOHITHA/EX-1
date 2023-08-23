/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.application4;

import java.util.Scanner;

/**
 *
 * @author lohit
 */
public class Application4 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double revenue = unitPrice * quantity;
        double discountRate = 0;

        if (quantity >= 100 && quantity <= 120) {
            discountRate = 0.1;
        } else if (quantity > 120) {
            discountRate = 0.15;
        }

        double discountAmount = revenue * discountRate;
        double discountedRevenue = revenue - discountAmount;

        System.out.println("The revenue from sale: " + discountedRevenue);
        System.out.println("After discount: " + discountAmount + "(" + (discountRate * 100) + "%)");

        scanner.close();
    }
}
    
        
