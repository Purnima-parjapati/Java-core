package Assignment;

import java.util.Scanner;

public class GrossSalary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter basic salary (-1 to exit): ");
            int basic = sc.nextInt();

            if (basic == -1) {
                break;
            }

            double hra, da, gross;

            if (basic > 15000) {
                hra = 0.2 * basic;
                da = 0.6 * basic;
            } else {
                hra = 3000;
                da = 0.7 * basic;
            }

            gross = basic + hra + da;
            System.out.println("Gross Salary = " + gross);
        }
    }
}
