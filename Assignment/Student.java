package Assignment;

public class Student {
    // Instance variables
    String name;
    int age;
    String department;

    // Default constructor
    Student(){
        this.name = "Unknown";
        this.age = 20;
        this.department =  " Unassigned";
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
        this.department = "IT";
    }
    // Constructor with three parameters: name, age, and department
    Student(String department,String name,int age ){
        this.name = name;
        this.age = age;
        this.department = department;

    }
    // for print student details
    void printDetails(){
        System.out.println("Name: "+ name + " Age: " + age +  " Department: " + department );
    }
}

class Main{
    public static void main(String[] args) {
        // Creating Student instances using different constructors
        Student student1 = new Student();
        Student student2 = new Student("Purnima",20);
        Student student3 = new Student("Computer","Vinay",21);

       student1.printDetails();
       student2.printDetails();
       student3.printDetails();

    }
}
