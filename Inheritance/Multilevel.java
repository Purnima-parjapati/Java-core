package Inheritance;

 class Multilevel {
     void sum(){
         System.out.println(" Hii from sum");
     }
}

class  Multilevel2 extends Multilevel{
     void sum(){
         System.out.println(" Hii from sum2");
     }
}

class Multilevel3 extends Multilevel2{
    public static void main(String[] args) {
        Multilevel3 show = new Multilevel3();
        show.sum();
        show.sum();

    }
}
