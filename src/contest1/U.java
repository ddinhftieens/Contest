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

public class U {
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        cin.nextLine();
        while(test-- > 0){
            String s = cin.nextLine().toLowerCase().trim();
            String[] x = s.split("\\s+");
            for(int i=0;i<x.length;i++){
                char[] y = x[i].toCharArray();
                y[0] = Character.toUpperCase(y[0]);
                x[i] = new String(y);
            }
            for(int i=1;i<x.length-1;i++){
                System.out.print(x[i] + " ");
            }
            System.out.print(x[x.length-1] + ", ");
            System.out.println(x[0].toUpperCase());
        }
    }
}
