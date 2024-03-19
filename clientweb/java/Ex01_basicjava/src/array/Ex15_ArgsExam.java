package array;

public class Ex15_ArgsExam {
    public static void main(String[] args) {
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < args.length;i++){
            sum+= Integer.parseInt(args[i]);
        }
        System.out.println("총점: " + sum);
        System.out.println("평균: " + sum/args.length);

        for(String val :args){
            sum2 += Integer.parseInt(val);
        }
        System.out.println("총점: "+sum2);
        System.out.println("평균: "+(sum2/args.length));
    }
}
