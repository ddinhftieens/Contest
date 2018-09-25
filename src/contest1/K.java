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

public class K {
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        for(int k=0;k<test;k++){
            int n = cin.nextInt();
            System.out.print("Test " + (k+1) + ": ");
            Phantich(n);
        }
    }
    public static void Phantich(int n){
        int i=2,value=0;
        while(n>1){
            if(SoNgTo(n)){
//                if(value!=0) System.out.print(i+"("+value+") ");
                System.out.println(n+"("+1+")");
                break;
            }
            else{
                while(n>0){
                    if(n%i==0){
                        value++;
                        n /= i;
                    }
                    else if(value!=0){
                        if(n==1) System.out.println(i+"("+value+")");
                        else System.out.print(i+"("+value+") ");
                        value=0;
                        break;
                    }
                    else i++;
                }
            }
            i++;
        }
    }
    public static boolean SoNgTo(int n){
        for(int i=2;i<=(int) Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
