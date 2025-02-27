package Pattern;
import java.util.*;
public class Pyramid_Star_Pattern_With_Space {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of  rows :");

        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            //to print the spaces 
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){

                if(i==1 || i==n|| j==1 || j==(2*i)-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
