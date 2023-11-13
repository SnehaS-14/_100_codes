package arrays;
import java.util.*;
public class smallandlarge {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
      }
      Arrays.sort(arr);
        System.out.println("The smallest num is:"+arr[0]);
        System.out.println("The largest num is:"+arr[arr.length-1]);
    }
}
