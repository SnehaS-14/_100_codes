
package arrays;
import java.util.*;
public class largestelement {
  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];//3
    System.out.println("enter the number");
    for(int i=0;i<n;i++) {
      arr[i]=sc.nextInt();

    }
    Arrays.sort(arr);
    System.out.println(arr[arr.length-1]);
  }
}


