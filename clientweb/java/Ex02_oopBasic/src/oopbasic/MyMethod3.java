package oopbasic;

public class MyMethod3 {
    // 매개변수로 전달받은 배열의 값에 1000을 더한 새로운 배열을 만들어서 리턴
    // 메소드명 : changeArr
    // 매개변수 : int []
    // 리턴값 : int []
    public int[] changeArr(int[] myarr){
        int [] arr = new int[myarr.length];
        for(int i=0;i<arr.length; i++){
            arr[i] = myarr[i]+1000;
        }
        return arr;
    }

}
