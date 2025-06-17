package Assignment;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        int[] arr = {5,10,15,20,25};
        Set<Integer> hs = new HashSet<>();
        for(Integer i : arr){
            hs.add(i);
        }
        System.out.println(hs);
        System.out.println(hs.contains(10));
        System.out.println(hs.remove(15));
        System.out.println(hs.size());


    }
}
