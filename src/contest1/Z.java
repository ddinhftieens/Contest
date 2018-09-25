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

public class Z {
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        int n;
        do{
           n = cin.nextInt();
           cin.nextLine();
           if(n!=0){
                String s1 = cin.next();
                String s2 = cin.next();
                String s = cin.next();
                int total = 0;
                String t = trontu(s1,s2,n);
                while(true){
                    String c = trontu(s1,s2,n);
                    total++;
                    if(c.equals(s)){
                        System.out.println(total);
                        break;
                    }
                    if(!c.equals(t)|| total==1 ){
                    } else {
                        System.out.println(-1);
                        break;
                    }    
                    s1 = c.substring(0, c.length()/2);
                    s2 = c.substring((c.length()/2));
                }
            }
        }while(n!=0);
    }
    public static String trontu(String s1, String s2,int n){
        String c = "";
        for(int i=0;i<n;i++){
            c = c.concat(Character.toString(s2.charAt(i)) + Character.toString(s1.charAt(i)));
        }
        return c;
    }
}
