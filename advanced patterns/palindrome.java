import java.util.*;
public class palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
           // first half of pattern
           // --> spaces 
           for(int j=1;j<=n-i;j++){
               System.out.print(" ");
           }
           for(int j=i;j>=1;j--){   // loop is in backword direction from i to 1
               System.out.print(j);
           }
           // second half of pattern
           for(int j=2;j<=i;j++){   // loop is in forward direction from 2 to i
               System.out.print(j);
           }
         System.out.println();
        }
    }
    
}


