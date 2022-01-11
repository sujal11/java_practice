 // mirror image of rhombus pattern
 public class rhombus2 {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            // print spaces first
            for(int j=1;j<=i;j++){         // only diff is the condition i.e. j<=i
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){   // 5 is fixed as we have to print 5 stars in single row,, we can change if we want
                System.out.print("*");
            }
        System.out.println();
        }
    }
    
}

