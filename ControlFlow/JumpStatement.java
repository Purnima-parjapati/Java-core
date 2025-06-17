package ControlFlow;

public class JumpStatement {
    public static void main(String[] args) {
        outer:
        for(int i=0;i>=5;i++){
            System.out.println(" outer" + i);
            inner:
            for(int j=0; j>=5;j++){
                if(i==3){
                    break;
                }
                System.out.println("inner" + j);
            }
        }
    }
}
