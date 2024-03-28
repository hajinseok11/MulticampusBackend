package Ex03_API_Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ex14_ArrayListExam {
    public static void main(String[] args) {    
        Random rand = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        // 랜덤수를 저장하는 for
        for(int i = 0; i< 6; i++){
            list.add(rand.nextInt(50)+1);
        }

        // ArrayList에 저장된 데이터를 꺼내는 for
        for(int data:list){
            if(data%2==0){
                System.out.println(data+"(짝수) ,");
            } else { 
                System.out.println(data + "(홀수) ,");
            }
        }
        System.out.println();
        int size = list.size();
        for (int i = 0; i < size; i++){
            int data = list.get(i);
            if(data%2==0){
                System.out.println(data+"(짝수) ,");
            } else { 
                System.out.println(data + "(홀수) ,");
            }
        }
    }
}
