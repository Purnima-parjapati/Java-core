package MethodOveriding;

public class Parent {
    void show1(){
        System.out.println("hii from show1");
    };

}
class child extends Parent{
    void show2(){
        System.out.println("hii from show2");
    }
}
class  overide {
    public static void main(String[] args) {
//         Parent parent = new Parent();
//         child cd = new child();
//         parent.show1();
//         cd.show2();
//         cd.show1();
         Parent parent1 = new child();



         parent1.show1();
         //parent1.show2();
    }

}

