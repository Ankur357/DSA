package Array;

import java.util.Arrays;
import java.util.Scanner;



public class TimeInterval {
    int start,end;

    public TimeInterval(int start,int end) {
        this.start=start;
        this.end=end;
    }

    public static boolean canAttendMeeting(TimeInterval[] arr){
        int[] start = new int[arr.length];
        int[] end = new int[arr.length];
        for(int i=0; i< arr.length; i++){
            start[i] = arr[i].start;
            end[i] = arr[i].end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        for(int i=0; i<start.length-1; i++){
            if(start[i+1]<end[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of dept.");
        int n = sc.nextInt();
        TimeInterval[] arr = new TimeInterval[n];
        System.out.println("Enter the starting and ending time of each dept. meeting");
        for(int i=0; i<arr.length; i++){
            arr[i] = new TimeInterval(sc.nextInt(),sc.nextInt());
        }
        if(TimeInterval.canAttendMeeting(arr)){
            System.out.println("Employee can attend all the meetings without any clash");
        }
        else {
            System.out.println("Employee can not attend all the meetings without any clash");
        }
    }
}
