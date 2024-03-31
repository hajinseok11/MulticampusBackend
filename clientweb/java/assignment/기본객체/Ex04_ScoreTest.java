public class Ex04_ScoreTest{
   public static void main(String []args){
      int totalScore = 0;
      Score s1 = new Score("홍길동", 10, 20, 30);
     
      
      Score s2 = new Score("김자바", 50, 40, 60);
      
     
      Score s3 = new Score("이디비", 70, 100, 50);
      
      System.out.println("이름\t국어\t영어\t수학\t총점\t평균");

      s1.print();
      s2.print();
      s3.print();
      
      int korTotal = s1.getKor()+s2.getKor()+s3.getKor();
      int engTotal = s1.getEng()+s2.getEng()+s3.getEng();
      int mathTotal = s1.getMath()+s2.getMath()+s3.getMath();
      totalScore = s1.getTotalScore()+s2.getTotalScore()+s3.getTotalScore();
      int avgScore = totalScore/3;
      System.out.print("총  계\t");
      System.out.println(korTotal+"\t"+engTotal+"\t"+mathTotal+"\t"+totalScore+"\t"+avgScore);
      
      // 총계용 국어, 영어, 수학, 총점, 평균값을 계산하여 출력되도록
      // 이곳을 완성하시오.
   }
}