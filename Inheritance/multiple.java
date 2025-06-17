//package Inheritance;
//
//class A {
//      private int age ;
//    void show1() {
//        System.out.println("Hi From A" );
//    }
//}
//
//class B {
//    void show1() {
//        System.out.println("Hi From B");
//    }
//}
//
//class C extends A {  //  Only one class extended
//    B b = new B();
//    A a = new A();
//    a.age = 19;
//    //  Create object of B to use its method
//
//    void showBoth() {
//        show1();
//        b.show1();
//    }
//}
//
// class InheritanceMain {
//    public static void main(String[] args) {
//        C c = new C();
//        c.showBoth();
//    }
//}
//
