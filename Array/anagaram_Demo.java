import java.util.*;
public class anagaram_Demo {
    public static ArrayList<String> anagram(String[] wordlist, String word){
        ArrayList<String> al=new ArrayList<>();
        char[] ch=word.toCharArray();
        Arrays.sort(ch);
        for(String wl:wordlist){
            char[] new_ch=wl.toCharArray();
            Arrays.sort(new_ch);
            if(Arrays.equals(new_ch,ch)){
                al.add(wl);
            }
        }
        return al;
    }
    public static void main(String[] args){
        String[] wordlist={"cat", "dog", "tac", "god", "good"};
        String word="cat";
        ArrayList<String> result=anagram(wordlist,word);
        System.out.println(result);
    }
}

