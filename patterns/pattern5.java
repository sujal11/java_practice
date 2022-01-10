import java.util.*;
public class pattern5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){    // printing spaces in rows according to the n-i value
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){     // printing stars in row according to the i value
                System.out.print("*");
            }
        System.out.println();
        }
    }
    
}
