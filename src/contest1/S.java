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

public class S {
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        cin.nextLine();
        while(test-- > 0){
            String s = cin.nextLine();
            StringTokenizer x = new StringTokenizer(s," ");
            int total = 0;
            while(x.hasMoreTokens()){
                x.nextToken();
                total++;
            }
            System.out.println(total);
        }
    }
}
