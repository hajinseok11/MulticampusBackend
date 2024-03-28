package Ex03_API_Util;

import java.util.ArrayList;

// List - ArrayList의 사용방법
public class Ex12_ArrayListTest01 {
    public static void main(String[] args) {
        ArrayList<Integer> v1 = new ArrayList<Integer>(); // int[] arr = new int[10];
        v1.add(10); // arr[0] = 10;
        System.out.println("현재 ArrayList에 저장된 요소의 개수 => " + v1.size());   // arr.length

        for(int i = 1; i<=10; i++){
            v1.add(i);
        }
        System.out.println("현재 ArrayList에 저장된 요소의 개수 => " + v1.size());   // arr.length

        System.out.println("1번 요소에 저장된 값 => "+v1.get(1)); // sysout(arr[1])

        for(int i = 0; i < v1.size(); i++){
            int data = v1.get(i);
            System.out.println(i+"번째 요소 => "+ data);
        }
        System.out.println("================================================");
        for(int data:v1){
            System.out.println(data);
        }
    }
}
