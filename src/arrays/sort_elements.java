package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class sort_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");

        int n = sc.nextInt();
        int arr[] = new int[n];//3
        System.out.println("Enter the numbers");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int min;
        for (int i = 0; i < arr.length; i++) {
            min=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min])
                    min=j;
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        }}
