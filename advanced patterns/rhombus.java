public class rhombus {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            // print spaces first
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=5;j++){   // 5 is fixed as we have to print 5 stars in single row,, we can change if we want
                System.out.print("*");
            }
        System.out.println();
        }
    }
    
}
