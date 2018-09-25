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

public class X {
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        cin.nextLine();
        for(int k=0;k<test;k++){
            String s = cin.nextLine().trim();
            String c = cin.nextLine();
            String[] x = s.split("\\s+");
            System.out.print("Test " + (k+1) + ": ");
            for(int i=0;i<x.length-1;i++){
                if(!c.toLowerCase().equals(x[i].toLowerCase())){
                    System.out.print(x[i] + " ");
                }
            }
            if(!c.toLowerCase().equals(x[x.length-1].toLowerCase())){
                System.out.println(x[x.length-1]);
            }
            else System.out.println();
        }
    }
}
