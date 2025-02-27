package Pattern;
import java.util.*;
public class Z_to_A {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the num :");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print((char)(90+1-(j)));
        }
        System.out.println();
    }

    }
}
