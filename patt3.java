import java.util.*;
public class patt3 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter thr no of rows :");
        int r = sc.nextInt();
        for (int i=r;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();

    }
    
}
