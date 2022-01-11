import java.util.*;
public class pyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            // print spaces first
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){    
                System.out.print(i+" ");   // we add space because we want space after every no.
            }
        System.out.println();
        }
    }
    
}
