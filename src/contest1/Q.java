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

public class Q {
    
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
            delete_row(x,n,m);
            delete_column(x,n,m);
            System.out.println("Test " + (k+1) + ":");
            show(x,n,m);
        }
    }
    public static void delete_row(int[][] x, int n, int m){
        int value = 0, address = 0;
        for(int i=0;i<n;i++){
            int total = 0;
            for(int j=0;j<m;j++){
                total += x[i][j];
            }
            if(total > value){
                value = total;
                address = i;
            }
        }
        for(int i=0;i<m;i++){
            x[address][i] = -1;
        }
    }
    public static void delete_column(int[][] x, int n, int m){
        int value = 0, address = 0;
        for(int i=0;i<n;i++){
            int total = 0;
            for(int j=0;j<m;j++){
                total += x[j][i];
            }
            if(total > value){
                value = total;
                address = i;
            }
        }
        for(int i=0;i<m;i++){
            x[i][address] = -1;
        }
    }
    public static void show(int[][] x, int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m-1;j++){
                if(x[i][j] != -1) System.out.print(x[i][j] + " ");
            }
            if(x[i][m-1] != -1) System.out.println(x[i][m-1]);
        }
    }
}
