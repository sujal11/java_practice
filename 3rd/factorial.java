import java.util.*;
public class factorial {
    public static void factorial_number(int n){
        int fact=1;
        if(n==0){
            System.out.println("0");
        }
        else if(n==1){
            System.out.println("1");
        }
        else{
        for(int i=n;i>=1;i--){
             fact=fact*(i);
        }System.out.println(fact);
    }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial_number(n);
     }
    
}
