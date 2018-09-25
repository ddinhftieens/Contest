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

public class G {
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        while(test-- > 0){
            int n = cin.nextInt();
            int total = 0;
            for(int i=(int) Math.pow(10, n-1);i<=((int) Math.pow(10, n)-1);i++){
                if(check(i)){
                    if(ngto(i)) total++;
                    if(dao(i,n)) total++;
                }
            }
            System.out.println(total);
        }
    }
    public static boolean check(int n){
        int value = 10;
        while(n>0){
            int t = n%10;
            if(t<value){
                value = t;
            }
            else return false;
            n /= 10;
        }
        return true;
    }
    public static boolean ngto(int n){
        for(int i=2;i<=(int) Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static boolean dao(int k, int n){
        int t = 0;
        while(k>0){
            t += (k%10) * (int)Math.pow(10, --n);
            k /= 10;
        }
        return ngto(t);
    }
}
