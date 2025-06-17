package MethodOveriding;

public class Teacher {
    void show(){
        System.out.println("hii from show1");
    }
}
class student extends Teacher{
    void show(){
        System.out.println("hii from show2");
    }
}

class overide1 {
    public static void main(String[] args) {
        //Teacher t1 = new Teacher();
        //student s1 = new student();
       // s1.show();
        Teacher obj = new student();
        student obj1 = (student) obj;

        obj1.show();

    }
}
