package com.mycompany.groupchat;

import java.util.Scanner;

public class Testing {
    public static void test(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered: " + userInput);
    }
}
