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

public class E {
//    public static int[] x = new int[1000000000];
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        while(test > 0){
            int value = 0;
            int n = cin.nextInt();
            int k = cin.nextInt();
            int[] x = new int[k+6];
            LocNgTo(x,k);
            for(int i=n;i<=k;i++){
                if( x[i] == 1 && check(i)) value++;
            }
            System.out.println(value);
            test--;
        }
    }
    public static void LocNgTo(int[] x,int k){
        x[2] = 1;
        for(int i=3;i<=k;i+=2) x[i]=1;
        for(int i=3;i*i<=k;i+=2){
            if(x[i]==1){
                for(int j=i*i;j<=k;j+= 2*i) x[j] = 0;
            }
        }
    }
    public static boolean check(int n){
        int total = 0;
        while(n > 0){
            int t = n%10;
            if(t!=2&&t!=3&&t!=5&&t!=7) return false;
            total += t;
            n /= 10;
        }
        return checkNgTo(total);
    }
    public static boolean checkNgTo(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
