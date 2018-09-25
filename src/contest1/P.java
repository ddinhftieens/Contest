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

public class P {
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        for(int k=0;k<test;k++){
            int n = cin.nextInt();
            int m = cin.nextInt();
            int[][] x = new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    x[i][j] = cin.nextInt();
                }
            }
            System.out.println("Test " + (k+1) +":");
            chuyenvi(x,n,m);
        }
    }
    public static void nhan(int[][] x, int[][] y, int n, int m){
        int[][] z = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int t=0;t<m;t++){
                    z[i][j] += x[i][t]*y[t][j];
                } 
            }
        }
        show(z,n);
    }
    public static void chuyenvi(int[][] x, int n, int m){
        int[][] y = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                y[i][j] = x[j][i];
            }
        }
        nhan(x,y,n,m);
    }
    public static void show(int[][] x,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println(x[i][n-1]);
        }
    }
}
