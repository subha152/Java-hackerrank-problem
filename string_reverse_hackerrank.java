import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        StringBuffer s2=new StringBuffer(s1);
        String s3=s2.reverse().toString();
        if(s1.equals(s3)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }       
        
    }
}



