package arraysExample;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][2];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0; j< arr[i].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print("[");
            for(int j=0; j< arr[i].length;j++){
                System.out.print(arr[i][j] );
            }
            System.out.print("]");
            System.out.println("\n");
        }
    }
}
