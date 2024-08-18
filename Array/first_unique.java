import java.util.*;
public class first_unique{
    public static void main(String args[]){
        int[] arr={-5,6,2,-9,0,-5,6,2,};
        // ArrayList<Integer> al=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
                        // System.out.println(hm);
        for(int j:arr){
            if(hm.get(j)==1){
                System.out.println(j);
                break;
                // return j;
                // al.add(j);
            }
        }
                // System.out.println("*************");
    }
}