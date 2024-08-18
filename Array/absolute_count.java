import java.util.*;
public class absolute_count{
    public static void main(String args[]){
        int[] arr={-5,2,-9,0,5,2,};
        HashSet<Integer> hst=new HashSet<>();
        for(int j:arr){
            hst.add(Math.abs(j));
        }
    System.out.println(hst.size());
    }
}