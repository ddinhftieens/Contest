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

public class B {
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        while(test > 0){
            int n = cin.nextInt();
            if(check(n)) System.out.println("YES");
            else System.out.println("NO");
            test--;
        }
    }
    public static boolean check(int n){
        int k = n%10;
        while(n>9){
            n /= 10;
        }
        return n == k;
    }
}
