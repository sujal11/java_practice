// Q.Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.*;
public class Ques3{
    public static void greatest(int a, int b){
        if(a>b){
            System.out.println(a+" is greatest");
        }else{
            System.out.println(b+" is greatest");
        }    
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        greatest(a,b);
    
    }
}
