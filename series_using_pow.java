import java.util.*;
import java.io.*;
import java.lang.Math;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int nth_term;
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            nth_term=a;
            for(int j=0;j<n;j++){
                nth_term= nth_term+(b*(int)(Math.pow(2,j)));
                System.out.print(nth_term+" ");
                
            }
            System.out.println();
        }
        in.close();
    }
}
