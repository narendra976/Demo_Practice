import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
private static int B,H;
private static boolean flag;

static{
    flag=true;
    try{
        Scanner scan = new Scanner(System.in);
        B= scan.nextInt();
        H= scan.nextInt();
        scan.close();
        if(B<=0 || H<=0) throw new java.lang.Exception("Breadth and height must be positive");
    }
    
    catch(Exception e){
        flag=false;
        System.out.println(e);
    }
   
};

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
