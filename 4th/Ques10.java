// Q.Write a program to print Fibonacci series of n terms where n is input by user
import java.util.*;
public class Ques10 {
    public static void fibonacci(int n){
    int a=0; int b=1;
    if(n==a){
    System.out.print(a+" ");
    }
    else if(n==b){
        System.out.print(a+" "+b);
    }
    else{
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int temp=a+b;
            a=b;
            b=temp;
            
        }System.out.println();
    }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        fibonacci(n);
    }
    
}
