package arraysExample;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

        //For each loop
        for(int i : arr){
            System.out.println(i);
        }
    }
}
