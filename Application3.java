/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.application3;

/**
 *
 * @author lohit
 */
public class Application3 {

    public static void main(String[] args) {
        int lowerLimit = 101;
        int upperLimit = 199;
        int divisibleBy = 8;
        int sum = 0;

        for (int i = lowerLimit; i < upperLimit; i++) {
            if (i % divisibleBy == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of numbers divisible by " + divisibleBy +
                           " between " + lowerLimit + " and " + upperLimit + ": " + sum);
    }
}

      
