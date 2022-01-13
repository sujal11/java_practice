// Q.Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n
import java.util.*;
public class Ques8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your base: ");
        int x = sc.nextInt();
        System.out.println("Enter your exponent: ");
        int n = sc.nextInt();
        int power=1;
        for(int j=1;j<=n;j++){
            power*=x;
        }
        System.out.println("Your answer is: "+power);
    }

    
}
