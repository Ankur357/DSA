package Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of 2D array in the form of row and column");
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        int[][] arr = new int[m][n];
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j]%2==0){
                    a1.add(arr[i][j]);
                }
                else
                    a2.add(arr[i][j]);
            }
        }

        System.out.println("Even elements array are " + a1);
        System.out.println("Odd elements array are " + a2);
    }
}