import java.util.*;
public class butterfly{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       // upper half of pattern
      for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
        System.out.print("*");
        }
        int spaces = 2*(n-i);
        for(int j=1;j<=spaces;j++){
        System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
        System.out.print("*");
        }
        System.out.println();
     }      // ;ower half of pattern
      for(int i=n;i>=1;i--){  // only the for loop will change (reverse) ,,for lower half other statements remains same as upper one 
         for(int j=1;j<=i;j++){
          System.out.print("*");
         }
         int spaces = 2*(n-i);
         for(int j=1;j<=spaces;j++){
          System.out.print(" ");
         }
         for(int j=1;j<=i;j++){
          System.out.print("*");
         }
         System.out.println();
     }
  }
}