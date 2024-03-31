public class Score {
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int totalScore;
    private double avgScore;
    public Score(){}
    public Score(String name, int kor, int eng, int math, int totalScore, double avgScore) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.totalScore = kor+eng+math;
        this.avgScore = totalScore/3;
    }
    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.totalScore = kor+eng+math;
        this.avgScore = totalScore/3;
    }

    public void print(){
        System.out.printf("%s\t%d\t%d\t%d\t%d\t%f\n",name,kor,eng,math,totalScore,avgScore);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return this.kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return this.eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return this.math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getTotalScore() {
        return this.totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public double getAvgScore() {
        return this.avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", kor='" + getKor() + "'" +
            ", eng='" + getEng() + "'" +
            ", math='" + getMath() + "'" +
            ", totalScore='" + getTotalScore() + "'" +
            ", avgScore='" + getAvgScore() + "'" +
            "}";
    }



}
