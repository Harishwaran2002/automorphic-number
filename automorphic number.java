import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num<1||num>9)
        {
            System.out.println("Invalid Input");
        }else {
            int Square=num*num;
            String numStr=Integer.toString(num);
            String SquareStr=Integer.toString(Square);
            if(SquareStr.endsWith(numStr)){
                System.out.println("Automorphic Number");
            }else{
                System.out.println("Not Automorphic Number");
            }
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
