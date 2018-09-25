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

public class H {
    
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        for(int k=0;k<test;k++){
            int n = cin.nextInt();          
            int[] x = new int[n+10];
            for(int i=0;i<n;i++){
                x[i] = cin.nextInt();
            }
            Arrays.sort(x,0,n);
            System.out.println("Test " + (k+1) + ":");
            int i = 0;
            while(i<n){
                if(ngto(x[i])){
                    int value = 1;
                  for(int j=i+1;j<n;j++){
                      if(x[j]==x[i]){
                          value++;
                      }
                      else{
                          i=j-1;
                          System.out.println(x[i] + " xuat hien " + (value) + " lan");
                          break;
                      }
                  }
                }
                i++;
            }           
        }
    }
    public static boolean ngto(int n){
        if(n==1) return false;
        for(int i=2;i<=(int) Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
