/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst1201;

import java.util.Scanner;

/**
 *
 * @author rkhatchadourian
 */
public class SquareDisplayer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Get input from user.
        System.out.print("Please enter a positive integer less than or equal to 15: ");
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();

        while (inputNumber < 1 || inputNumber > 15) {
            System.out.print("Incorrect. Please enter another number: ");
            inputNumber = scanner.nextInt();
        }

        //At this point, I should have a valid input.
        //2. Draw the square.
    }

}
