/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package contest1;

/**
 *
 * @author Dell
 */
import java.util.*;

public class A {
    
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        while( test > 0){
            long a = cin.nextInt();
            long b = cin.nextInt();
            long k = UCLN(a,b);
            System.out.println(k + " " + (a*b)/k);
            test--;
        }
    }
    public static long UCLN(long a, long b){
        while( b!= 0){
            long t = a%b;
            a=b;
            b=t;
        }
        return a;
    }
}
