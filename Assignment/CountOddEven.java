package Assignment;

import java.util.Scanner;

public class CountOddEven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenCount = 0, oddCount = 0;

        while (true) {
            System.out.print("Enter a number (-1 to exit): ");
            int num = sc.nextInt();

            if (num == -1) {
                break;
            }

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Total Even numbers: " + evenCount);
        System.out.println("Total Odd numbers: " + oddCount);
    }
}

