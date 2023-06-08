package ArraySecondOrderElements;

import java.net.SocketOption;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
int result[] = getSecondOrderElements( num.length, num);
        System.out.println("Output is : "+ Arrays.toString(result));
    }

    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.

        int large = a[0];
        int secLarge = a[0];
        int small = a[0];
        int secSmall = a[0];
        for(int i=0; i< n ;i++){
            if(a[i]>= large){
                int tempLarge = large ;
                large=a[i];
                if(tempLarge>=secLarge){
                    secLarge=tempLarge;
                }
            }
            else{
                if(a[i]<large && a[i]>=secLarge){
                    secLarge=a[i];
                }

            }

            if(a[i]<=small){
                int tempsmall = small;
                small=a[i];
                if(tempsmall<=secSmall){
                    secSmall = tempsmall;
                }
            }
            else{
                if(a[i]<= secSmall && a[i] > small){
                    secSmall =a[i];
                }
                else if(a[i]>=secSmall && a[i]<small){
                    secSmall=a[i];
                }
            }
        }
        int res[] ={secLarge, secSmall};
        return res ;
    }
}
