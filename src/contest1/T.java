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

public class T {
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        cin.nextLine();
        while(test-- > 0){
            String s = cin.nextLine();
            StringBuilder x = new StringBuilder(s);
            String c = x.reverse().toString();
            if(s.equals(c)){
                boolean OK = true;
                char[] t = c.toCharArray();
                for(int i=0;i<t.length;i++){
                    if(((int) t[i])%2 != 0){
                        System.out.println("NO");
                        OK = false;
                        break;
                    }
                }
                if(OK) System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
