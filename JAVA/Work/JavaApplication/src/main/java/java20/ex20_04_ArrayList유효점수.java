package java20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ex20_04_ArrayList유효점수 {
    
    static Scanner key = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int x = 0;
      
        List<Integer> list = new ArrayList<Integer>();
        
        System.out.print("심사위원수를 입력하시오: ");
        x = key.nextInt();
        addList(list, x);
        
        System.out.println(list.toString());
      
        Collections.sort(list);
        
        int    tot = yuScore(list);
        double avg = (double)tot / (list.size()-2);
        System.out.println();
        System.out.println("합계: " + tot);
        System.out.format("평균: %.2f", avg);
    }
    
    public static void addList(List<Integer> list, int x) {
        for (int i=0; i<x; i=i+1) {
            System.out.print("점수를 입력하시오: ");
            int y = key.nextInt();
            
            list.add(i, y);
        }
    }
    
    public static int yuScore(List<Integer> list) {
        int tot=0;
        System.out.print("유효 점수 : ");
        for (int i=1; i<list.size()-1; i=i+1) {            
            System.out.print(list.get(i) + " ");
            tot = tot + list.get(i);
        }
        return tot;
    }
}
