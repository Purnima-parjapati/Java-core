package MethodOverloading;
class Student {
    String name;
    int age;
    Student() {
        name = "Unknown";
        age = 0;
    }
    Student(String n) {
        name = n;
        age = 0;
    }
    Student(String n, int a) {
        name = n;
        age = a;
    }
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Purnima");
        Student s3 = new Student("Neha", 21);

        s1.display();
        s2.display();
        s3.display();
    }
}

