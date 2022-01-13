// Q.Write à function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;
public class Ques4 {
    public static void getCircumference(Double radius){
        Double Circumference;
        Circumference = 2*3.14*radius;
        System.out.println(Circumference);
        

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Double radius = sc.nextDouble();
        getCircumference(radius);


        }
    }
    

