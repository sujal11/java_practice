// Diamond pattern
import java.util.*;
public class diamond {
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      // for upper half
      for(int i=1;i<=n;i++){
          for(int j=1;j<=n-i;j++){
              System.out.print(" ");
          }
          for(int j=1;j<=2*i-1;j++){    // 2*i-1 is the number of stars print in each row
              System.out.print("*");
          }
          System.out.println();
      }
      // for lower half          
      for(int i=n;i>=1;i--){        // --> reversing the outer loop
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){    
            System.out.print("*");
        }
        System.out.println();
    }

    }
    
}
