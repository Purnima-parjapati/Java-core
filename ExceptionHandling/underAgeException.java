package ExceptionHandling;

import java.util.Scanner;

class underageException extends RuntimeException{
    underageException(){
        System.out.println("under age");
    }

}
class voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your age:");
        int age = sc.nextInt();

        if (age <= 18) {
            throw new underageException();
        } else {
            System.out.println(" You are adult");
        }
    }
}

