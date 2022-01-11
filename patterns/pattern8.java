// Floyd's Triangle
import java.util.*;
public class pattern8 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int number=1;
        // outer loop --> used to count no. of rows
        for(int i=1;i<=n;i++){
            //inner loop --> used to count no. of elements print in single row
            for(int j=1;j<=i;j++){
              System.out.print(number+" ");
              number++;
            }
            System.out.println();
        }
    }
    
}
