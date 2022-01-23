// Q.Write a function that calculates the Greatest Common Divisor of 2 numbers,
import java.util.*;
public class Ques9 {
    public static void commonDivisor(int a,int b){
        int var=0;
        for(int i=1;i<=a&&i<=b;i++){
            if (a%i==0 && b%i==0 ){
                var=i;
            }
        }System.out.println("Greatest Common Divisor is "+var);

    }   
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        commonDivisor(a,b);
    }
}
