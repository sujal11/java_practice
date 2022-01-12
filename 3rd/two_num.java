import java.util.*;
public class two_num {
    
    public static void sum_numbers(int num1,int num2){
        int sum = num1 + num2 ;
        System.out.println(sum);
        return ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sum_numbers(num1,num2);

    }
    
}
