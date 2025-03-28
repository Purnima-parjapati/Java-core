 
// Data Types  

// Types of DataType -
// Data Type	Size	Default Value	Example
// byte	1 byte	0	byte b = 127;
// short	2 bytes	0	short s = 32000;
// int	4 bytes	0	int i = 100000;
// long	8 bytes	0L	long l = 1000000000L;
// float	4 bytes	0.0f	float f = 10.5f;
// double	8 bytes	0.0d	double d = 99.99;
// char	2 bytes	'\u0000' (null)	char c = 'A';
// boolean	1 bit	false	boolean flag = true;

public class Datatype {

    public static void main(String[] args) {
        System.out.println("Int Max value: " + Integer.MIN_VALUE);
        System.out.println("Int Max value: " + Integer.MAX_VALUE);

        System.out.println("Int Max value: " + Long.MIN_VALUE);
        System.out.println("Int Max value: " + Long.MAX_VALUE);
    }
}

 class Main {
    public static void main(String[] args) {
        // int i=10;

        // Integer ii=i;
        // Integer iii = Integer.valueOf(i);
        // Integer iiii = new Integer(i);
        // Explcit
        // System.out.println(i);
        // System.out.println(ii);
        // System.out.println(iii);

        Integer i = 10;
        int ii = i;
        int iii = i.intValue();
        System.out.println(i);

    }
}

*
public class Test{

    void modify(int num){
        num = num+10;
        System.out.println(num);

    }

public static void main(String[] args)
{
    int original = 10;
    System.out.println("before passing:  "+ original);

    Test test =  new Test();
    test.modify(original);

    System.out.println("after passing: "+ original);
}
    
} */


// public class Test {

//     public static void main(String[] args) {
//         byte b = 120;
//         int i = b;              //typecasting L to H

//         System.out.println(b);
//         System.out.println(i);

//     }
// }

//  public class Test {

//     public static void main(String[] args) {
//          int i = 130;
//         byte b = (byte)i;     // typecasting   H to L 

//          System.out.println(b);
//          System.out.println(i);

//      }
//  }
