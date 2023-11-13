package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class second_small_num {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();

        }
        Arrays.sort(arr);
        System.out.println("The second smallest num is:"+arr[1]);
    }
}





