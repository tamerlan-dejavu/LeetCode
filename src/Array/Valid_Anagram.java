package Array;

import java.util.HashMap;

public class Valid_Anagram {
    public static boolean isAnagram(String s, String t) {
        // first solution
//        if(s.length()!=t.length()) return false;
//        HashMap<Character, Integer> map1 = new HashMap<>();
//        HashMap<Character, Integer> map2 = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            map1.put(s.charAt(i) ,  map1.getOrDefault(s.charAt(i), 0) + 1);
//            map2.put(t.charAt(i) ,  map2.getOrDefault(t.charAt(i), 0) + 1);
//        }
//        return map1.equals(map2);
        // second solution
        if(s.length()!=t.length()) return false;
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }
        for (int a : arr){
            if(a!=0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("Lala" , "Lala"));
    }
}
