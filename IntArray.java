


import java.util.Arrays;
import java.util.Scanner;

public class IntArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int NM [] = new int [5];
        int v = 0;
        
        
       
       for(int i = 0; i<NM.length; i++){
           
          System.out.println("enter number : ");
       NM[i] = sc.nextInt();
          
       }
       System.out.println("First to last: " +"\n"+Arrays.toString (NM));
       System.out.println("last to first: ");
       
       for (int c = NM.length - 1 ;c>= 0; c--){
           System.out.print((NM[c])+" ,");
           
    }
       
       
    }
}
