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

public class R {
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[][] x = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                x[i][j] = cin.nextInt();
            }
        }
        int k = cin.nextInt();
        for(int i=0;i<k;i++){
            int u = cin.nextInt();
            int v = cin.nextInt();
            R_1.delete_row(x, n, u);
            R_1.delete_column(x, n, v);
            n--;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                System.out.print(x[i][j] + " ");
            }
            System.out.println(x[i][n-1]);
        }
    }
}
