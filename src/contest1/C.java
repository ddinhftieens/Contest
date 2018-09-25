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

public class C {
    
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        while(test > 0){
            int k = cin.nextInt();
            if(check(k) == 0) System.out.println("YES");
            else System.out.println("NO");
            test--;
        }
    }
    public static int check(int n){
        int total = 0;
        while(n>0){
            total += n%10;
            n /= 10;
        }
        return total % 10;
    }
}
