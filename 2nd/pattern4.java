    // Inverse of HALF PYRAMID 
import java.util.*;
public class pattern4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // taking 1 variable as there is no. of rows = no. of column
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            } System.out.println();
        }
    }
    
}
