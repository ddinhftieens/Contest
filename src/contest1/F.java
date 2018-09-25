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

public class F {
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        while(test > 0){
            int n = cin.nextInt();
            int[] x = new int[n+6];
            for(int i = 0; i<n; i++){
                x[i] = cin.nextInt();
            }
            if(check(x,n)) System.out.println("YES");
            else System.out.println("NO");
            test--;
        }
    }
    public static boolean check(int[] x, int n){
        for(int i=0 ; i<n/2 ; i++){
            if(x[i] != x[n-1-i]) return false;
        }
        return true;
    }
}
