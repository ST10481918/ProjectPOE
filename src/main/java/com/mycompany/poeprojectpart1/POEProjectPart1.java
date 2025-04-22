/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poeprojectpart1;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class POEProjectPart1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String username;
        String password;
        String phoneNumber;

        // Get username
        System.out.print("Enter your username (min 5 characters and must include '_'): ");
        username = input.nextLine();

        // Validate username
        while (!isValidUsername(username)) {
            System.out.print(" Username must be at least 5 characters and contain an underscore (_). Try again: ");
            username = input.nextLine();
        }

        // Get password
        System.out.print("Enter your password (min 8 chars and must include at least 1 special character): ");
        password = input.nextLine();

        // Validate password
        while (!isValidPassword(password)) {
            System.out.println("Password must be at least 8 characters and include a special character (e.g., !, @, #, etc.)");
            System.out.print("Enter your password again: ");
            password = input.nextLine();
        }

        // Get phone number
        System.out.print("Enter your South African phone number (start with +27 or 0): ");
        phoneNumber = input.nextLine();

        // Validate phone number
        while (!isValidSouthAfricanNumber(phoneNumber)) {
            System.out.print("Invalid phone number. Please enter a valid South African phone number: ");
            phoneNumber = input.nextLine();
        }

        // Registration success
        System.out.println("Registration Successful!");
        System.out.println("Username: " + username);
        System.out.println("Phone Number: " + phoneNumber);

        input.close();
    }

    // Username must be at least 5 chars and contain "_"
    public static boolean isValidUsername(String username) {
        return username.length() >= 5 && username.contains("_");
    }

    // Password must be at least 8 chars and contain special char
    public static boolean isValidPassword(String password) {
        return password.length() >= 8 && containsSpecialCharacter(password);
    }

    // Check if password has a special character
    public static boolean containsSpecialCharacter(String password) {
        String specialChars = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/";
        for (int i = 0; i < password.length(); i++) {
            if (specialChars.contains(Character.toString(password.charAt(i)))) {
                return true;
            }
        }
        return false;
    }

    // Validate South African number format
    public static boolean isValidSouthAfricanNumber(String number) {
        if (number.startsWith("0") && number.length() == 10) {
            return true;
        } else if (number.startsWith("+27") && number.length() == 12) {
            return true;
        } else {
            return false;
        }
    }
}




  