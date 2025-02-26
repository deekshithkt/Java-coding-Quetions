package TCS;
import java.util.*;
public class Pair_Od_Divisble_By_2 {
    public static void main(String args[]){
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size  of test cases :");
        int test_case=sc.nextInt();
        for(int i=1;i<=test_case;i++){
        System.out.println("Enter the size of "+i);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int j=0;j<n;j++){
            arr[j]=sc.nextInt();
        }
        for(int k=0;k<n-1;k++){
            
            for(int l=k+1;l<n;l++){
               if((arr[k]+arr[l])%2==0){
                  count++;
               }
            }
        }
         System.out.println("value is"+count);
         count=0;
        }
    }
}
