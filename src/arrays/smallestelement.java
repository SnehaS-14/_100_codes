package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class smallestelement {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int arr[] = new int[n];//3

        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();

        }
        Arrays.sort(arr);
        System.out.println(arr[0]);
    }
}




