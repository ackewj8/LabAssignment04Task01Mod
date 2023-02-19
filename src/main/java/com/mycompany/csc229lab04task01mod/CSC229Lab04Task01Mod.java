/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc229lab04task01mod;
import java.util.Scanner;

/**
 *
 * @author willi
 * GitHub Link: https://github.com/ackewj8/LabAssignment04Task01Mod.git
 */
public class CSC229Lab04Task01Mod {
    // 1 + 1 + n/2 + n/2 = n/2
    // The runtime complexity of countDown is O(n/2)
    
    // int num has a complexity of 1
    static void countDown(int num) { // countDown function
        // runs 1 time
        if (num == 0) // test
            System.out.println("Blastoff!");
        else if (num % 2 == 0) { // only outputs even numbers
            System.out.println("...");
            // runs n/2 times
            countDown(num - 1); // recursive call
        }
        else {
            // runs n/2 times
            countDown(num - 1); // recursive call
        }
    }
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num; // How many times countDown is run
        // How many times countDown is run
        System.out.println("How many seconds until blast off?: ");
        num = scnr.nextInt(); // Assign num the value of the user's input
        countDown(num); // Running countDown n times
    }
}
