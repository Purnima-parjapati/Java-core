package ControlFlow;

import java.util.Scanner;

public class SwapWithTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();

        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swapping using a third variable
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:  a = " + a + ", b = " + b);
    }
}






