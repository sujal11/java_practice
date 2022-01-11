import java.util.*;
public class pattern7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){   // i=0 because we want n elements in our first row so n-i => n-0 => n,,, 
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    
}
