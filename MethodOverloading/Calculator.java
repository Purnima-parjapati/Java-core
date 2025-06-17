package MethodOverloading;

public class Calculator {

    // Method to add two integers
    int add(int a,int b)
    {
        System.out.println("Sum of 2 integers: " +(a+b));
        return a+b ;

    }
    // Overloaded method to add three integers
    int add(int a , int b , int c)
    {
        System.out.println("Sum of 3 integers: " +(a+b+c));
        return a + b + c;
    }
// Overloaded method to add two double values
    double add( double a , double b){

        System.out.println("Sum of 2 double values: " +(a+b));
        return a + b;
    }
}
 class Main {
     public static void main(String[] args) {
         // Creating object of Calculator
         Calculator cal = new Calculator();
          cal.add(2,3);
          cal.add(3,4,5);
          cal.add(2.222,2.3333);

     }
 }
