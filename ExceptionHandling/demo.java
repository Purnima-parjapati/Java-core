package ExceptionHandling;



public class demo {
    public static void main(String[] args) {
        try{
            int a = 2;
            int b = 0;
            int result = a/b;
        } catch (ArithmeticException e) {
           System.out.println("Airthmatic exception beacuse of,  / 0");
            e.printStackTrace();
        }
        finally {

       }
    }
}


