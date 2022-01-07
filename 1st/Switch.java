import java.util.*;
public class Switch {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      String button = sc.nextLine();
      switch(button){
          case "a":
          System.out.println("ENGLISH");
          break;
          case "b":
          System.out.println("HINDI");
          break;
          default:
          System.out.println("INVALID BUTTON");
      }
    }
    
}
