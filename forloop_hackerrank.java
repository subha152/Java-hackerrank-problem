import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);    
    int num=input.nextInt();
    for(int i = 1; i <= 10; i++){
        int result=num*i;
        System.out.printf("%d x %d = %d\n", num, i, result);
        
        }
    
    }
}
