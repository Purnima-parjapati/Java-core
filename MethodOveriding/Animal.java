package MethodOveriding;

public class Animal {
   void makeSound(){
        System.out.println("The animal make a sound");
    }

}

class cat extends Animal{
    void makesound(){
        System.out.println("The Cat meows");
    }
}
class dog extends Animal{
    void makesound(){
        System.out.println("The dogs barks");
    }
}

class pet {
    public static void main(String[] args) {
        Animal animal = new Animal();
        cat Cat = new cat();
        dog Dog = new dog();
        animal.makeSound();
        Cat.makesound();
        Dog.makesound();

    }
}