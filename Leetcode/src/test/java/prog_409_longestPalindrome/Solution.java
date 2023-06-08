package prog_409_longestPalindrome;

import java.util.HashSet;

public class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> storage = new HashSet<>();

        int counter = 0 ;
        for(int i=0; i<=s.length()-1; i++){ // O(n) time complexity and O(1) space complexity coz even if we have many
            // characters we will be storing only 26 characters for 26 alphabets
            char c = s.charAt(i);
            if(storage.contains(c)){
                storage.remove(c);
                counter=counter + 2 ;
            }
            else{
                storage.add(c);
            }
        }
        if(!storage.isEmpty()){
            counter = counter +1 ;
        }
        return counter;
    }
}
