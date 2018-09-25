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

public class N {
    
    public static void xuat(int[][] a,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println(a[i][n-1]);
        }
    }
    public static void xoanoc(int n){
        int[][] a = new int[n][n];
        int i,d=n*n,b=0;
        while(b<=n/2){
            for(i=b;i<n-b;i++) a[b][i] = d--;
            for(i=b+1;i<n-b;i++) a[i][n-b-1] = d--;
            for(i=n-b-2;i>=b;i--) a[n-b-1][i] = d--;
            for(i=n-b-2;i>b;i--) a[i][b] = d--;
            b++;
        }
        xuat(a, n);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int k=0;k<t;k++){
            int n = in.nextInt();
            System.out.println("Test " + (k+1) + ":");
            xoanoc(n);
        }
        
    }
}
