// to print the patter like below 
// For n= 3,
// pattern:         3 3 3 2 2 2 1 1 1
//                     3 3 2 2 1 1 
//                     3 2 1

// For n= 2,
// pattern:  2 2 1 1
//             2 1



// Input: 2
// Output: [2, 2, 1, 1, -1, 2, 1, -1]
// Input: 3
// Output: [3, 3, 3, 2, 2, 2, 1, 1, 1, -1, 3, 3, 2, 2, 1, 1, -1, 3, 2, 1, -1]
// Input: 1
// Output: [1, -1]
import java.util.Scanner;
class Print_Pattern_Number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print :");
        int n=sc.nextInt();

        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i +" ");
            }
        }
    }
}