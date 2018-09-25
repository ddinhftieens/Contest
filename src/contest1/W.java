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

public class W {
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        cin.nextLine();
        String[] t = new String[test];
        int[] u = new int[test];
        for(int i=0;i<test;i++){
            u[i] = 1;
        }
        for(int k=0;k<test;k++){
            String s = cin.nextLine().toLowerCase().trim();
            String[] x = s.split("\\s+");
            String c = x[x.length-1];
            for(int i=0;i<x.length-1;i++){
                c = c.concat(Character.toString(x[i].charAt(0)));
            }
            t[k] = c.concat("@ptit.edu.vn");
            for(int i=0;i<k;i++){
                if(t[k].equals(t[i])){
                    c = c.concat(++u[k] + "@ptit.edu.vn");
                    t[k] = c;
                    break;
                }
            }
            System.out.println(t[k]);
        }
    }
}
