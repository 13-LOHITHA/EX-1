/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.application6;

/**
 *
 * @author lohit
 */
public class Application6 {

    public static void main(String[] args) {
        int givenNumber = 987654321;
        int searchNumber = 5;

        if (containsNumber(givenNumber, searchNumber)) {
            System.out.println("The given number contains the search number.");
        } else {
            System.out.println("The given number does not contain the search number.");
        }
    }

    public static boolean containsNumber(int number, int search) {
        while (number > 0) {
            int digit = number % 10;
            if (digit == search) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
    
        
