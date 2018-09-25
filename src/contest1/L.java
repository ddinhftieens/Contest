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

public class L {
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);
        Map<Integer, Integer> map = new LinkedHashMap <>();
        while(cin.hasNextInt()){
            int n = cin.nextInt();
            if(!check(n)) continue;
            if(map.containsKey(n)){
                map.replace(n, map.get(n)+1);
            }
            else{
                map.put(n, 1);
            }
        }
        map.entrySet().forEach((entry) -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
//        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
    }
    public static boolean check(int n){
        int total = 0, k = n;
        while(n>0){
            total = total*10 + n%10;
            n /= 10;
        }
        return k==total;
    }
}
