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

public class D {
    
    public static void main(String[] args) {
        
        Scanner cin  = new Scanner(System.in);
        int test = cin.nextInt();
        while(test > 0){
            int n = cin.nextInt();
            if(n%2==0){
                int total = 0;
                for(int i = (int) Math.pow(10, n/2-1); i < (int) Math.pow(10, n/2) - 1;i++){
                     if(check(i)%5==0){
                         total++;
                     }
                }
                System.out.println(total);
            }
            else{
                int total = 0;
                for(int i = (int) Math.pow(10, n/2); i < (int) Math.pow(10, n/2+1) - 1;i++){
                     if((2*check(i) - i%10)%10 == 0 && (i%10)%2==0){
                         total++;
                     }
                }
                System.out.println(total);
            }
            test--;
        }
    }
    public static int check(int n){
        int total = 0;
        while(n > 0){
            total += n%10;
            n /= 10;
        }
        return total;
    }
}
