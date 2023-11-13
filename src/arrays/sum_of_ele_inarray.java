package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class sum_of_ele_inarray {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        int arr[] = new int[n];//3
        System.out.println("Enter the numbers");
        int sum=0;
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
            sum=sum+arr[i];

        }
        Arrays.sort(arr);
        System.out.println("the sum is:"+sum);

    }
}





