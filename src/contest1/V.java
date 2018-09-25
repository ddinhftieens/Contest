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

public class V {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int test = cin.nextInt();
        cin.nextLine();
        while(test-- > 0){
            String s1 = cin.nextLine();
//            String s2 = cin.nextLine();
            Set<String> set_s1 = new HashSet<>();
            set_s1.addAll(Arrays.asList(s1.split("\\s+")));
//            Set<String> set_s2 = new HashSet<>();
//            set_s2.addAll(Arrays.asList(s2.split("\\s+")));
//            Set<String> s = new HashSet<>(set_s1);
//            s.retainAll(set_s2);
//            set_s1.removeAll(s);
            for(String i : set_s1){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
