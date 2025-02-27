package Pattern;
import java.util.*;
public class Mirrored_Rhombus_Star {
 public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number :");
int n=sc.nextInt();
for(int i=0;i<n;i++){
    for(int j=n-i;j>=0;j--){
        System.out.print(" ");
    }
    for(int j=0;j<n;j++){
        System.out.print("*");
    }
    System.out.println();
}

 }   
}
