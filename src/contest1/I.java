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

public class I {
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        for(int k=0;k<test;k++){
            int n,m,p;
            n = cin.nextInt(); m = cin.nextInt(); p = cin.nextInt();
            int[] x = new int[100];
            int[] y = new int[100];
            for(int i=0;i<n;i++) x[i] = cin.nextInt();
            for(int i=0;i<m;i++) y[i] = cin.nextInt();
            System.out.println("Test " +(k+1)+":");
            for(int i=0;i<p;i++) System.out.print(x[i] + " ");
            for(int i=0;i<m;i++) System.out.print(y[i] + " ");
            for(int i=p;i<n-1;i++) System.out.print(x[i] + " ");
            System.out.println(x[n-1]);
        }
    }
}
