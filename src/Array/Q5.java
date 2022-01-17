package Array;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int fac=1,c=0;
        for(int i=1; i<=n; i++){
            fac*=i;
        }
        while(fac!=0){
            int rem = fac%10;
            if(rem == 0){
                c++;
            }
            else{
                break;
            }
            fac/=10;
        }
        System.out.println("No. of trailing zeroes are " + c);
    }
}
