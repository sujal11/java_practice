import java.util.*;
public class pattern1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // n=no. of rows
        int m = sc.nextInt();  // m=no. of columns
        // outer loop
        for(int i=1;i<=n;i++){
            // inner loop
            for(int j=1;j<=m;j++){
                System.out.print("* ");   // printing star in same line
            } System.out.println();    // using this statement for next line
        }
    }
    
}
