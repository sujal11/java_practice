import java.util.*;
public class two_numbers {
    
    public static void multiplyNumbers(int num1,int num2){
        int product = num1*num2 ;
        System.out.println(product);
        return ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        multiplyNumbers(num1,num2);

    }
    
}