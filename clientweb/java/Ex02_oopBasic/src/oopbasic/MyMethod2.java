package oopbasic;

public class MyMethod2 {
	public void GuGu(int dan) {
		System.out.print(dan+"단:");
		for(int i=1;i<=9;i++) {
			System.out.println(dan + "*"+i+"="+(dan*i));
		}
	}
	public void printGuGu(){
		for(int dan=2;dan<=9;dan++) {
			for(int i=1;i<=9;i++) {
				System.out.print(dan + "*"+i+"="+(dan*i)+"\t");
			}
			System.out.println();
		}
	}
	public int calc(int opr, int num1, int num2){
        int result = 0;
        switch (opr) {
            case 1:
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1*num2);
                break;
            case 4:
                System.out.println(num1/num2);
                break;
            }
            return result;
        }
	
	
}
