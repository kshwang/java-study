package java20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex20_02_ArrayList유효점수 {
    
    static Scanner key = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int x = 0;
      
        List<Integer> list = new ArrayList<Integer>();
        
        System.out.print("학생수를 입력하시오: ");
        x = key.nextInt();
        addList(list, x);
        
        System.out.println(list.toString());
      
        int sum = sumList(list);
        double avg = (double)sum / x;
        System.out.println("평균은: " + avg);
    }
    
    public static void addList(List<Integer> list, int x) {
        
        for (int i=0; i < x; i=i+1) {
            System.out.print("성적을 입력하시오: ");
            int y = key.nextInt();
            
            list.add(i, y);
        }
    }
    
    public static int sumList(List<Integer> list) {
        
        int sum = 0;
        
        for (int i=0; i<list.size(); i=i+1) {
            sum = sum + list.get(i);
        }
        return sum;
    }
    
    public static void printScore(List<Integer> list) {
        
        System.out.print("유효 점수 : ");
        for (int i=1; i<=list.size()-2; i=i+1) {            
            System.out.print( list.get(i) + " " );
        }
    }
}
