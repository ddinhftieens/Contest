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

public class J {
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        while(test > 0){
            int n = cin.nextInt();
            int[] x = new int[n+6];
            for(int i=0;i<n;i++){
                x[i] = cin.nextInt();
            }
            int total = 1;
            int value = x[0];
            for(int i=1;i<n;i++){
                if(x[i]>=value){
                    total++;
                    value = x[i];
                }
            }
            System.out.println(total);
            test--;
        }
    }
}
