package Assignment;

public class Rectangle { // Create a class Rectangle
    int length;
    int width;
    int area;

    Rectangle(int length,int width){ // Create a constructor that accept length & width
        this.length = length;
        this.width = width;

    }
    void Area(){  // Area method for calculate area
        area = length*width;
        System.out.println("Area:"+ area);

    }

}
class display {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10,20); // make object and give values
        Rectangle r2 = new Rectangle(100,60);
        r1.Area();  // call the method using object
        r2.Area();

        if(r1.area>r2.area){  // compare the areas of two rectangle
            System.out.println("Rectangle 1 is bigger and Rectangle 2 is small");
        }
        else if (r1.area<r2.area) {
            System.out.println(" Rectangle 1 is Small and Rectangle 2 is bigger ");
        }
        else {
            System.out.println(" They are equal");
        }

    }
}
