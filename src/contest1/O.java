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

public class O {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            int n = in.nextInt();
            System.out.println("Test " + (i+1) + ":");
            xoanocnt(n);
        }
    }
    public static void xoanocnt(int n){
        int[][] a = new int[n][n];
        int i,d=n*n,b=0;
        int[] c = new int[d];
        int dem=2;
        int k=0;
        while(k<d){
            if(ktnt(dem)){
                c[k]=dem;
                k++;
            }
            dem++;
        }
        int h=0;
        while(b<=n/2){
            for(i=b;i<n-b;i++) a[b][i] = c[h++] ;
            for(i=b+1;i<n-b;i++) a[i][n-b-1] = c[h++];
            for(i=n-b-2;i>=b;i--) a[n-b-1][i] = c[h++];
            for(i=n-b-2;i>b;i--) a[i][b] = c[h++];
            b++;
        }
        xuat(a, n);
    }
    public static boolean ktnt(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void xuat(int[][] a,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println(a[i][n-1]);
        }
    }
}
