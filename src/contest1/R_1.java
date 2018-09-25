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
public class R_1 {
    
    public static void delete_row(int[][] x, int n, int i){
        for(int u=i;u<n-1;u++){
            for(int v=0;v<n;v++){
                x[u][v] = x[u+1][v];
            }
        }
    }
    public static void delete_column(int[][] x, int n, int j){
        for(int u=0;u<n;u++){
            for(int v=j;v<n-1;v++){
                x[u][v] = x[u][v+1];
            }
        }
    }
}
