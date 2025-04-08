public class Variable{
    int b = 20; // instance variable
    int c = 30;
    static int d = 40; // static variable

    void sum(){
        int a = 10; // local variable
        int sum = a+b;


    }
    static void mul(){
        // int mul = d*b;
        int e = 50;
        int mul = d*e;
    }

    public static void main(String[] args) {
        Variable variable = new Variable();
        System.out.println(variable.b);
    }
}
