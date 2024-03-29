package Ex03_API_Util;

import java.util.Date;

// DTO클래스, VO클래스, 도메인, 엔티티 = 각각 다른 내용
// DTO는 디비에 저장되어있는 데이터를 오브젝트로 변환해서 작업
// 계층간에 데이터를 전송

public class StudentDTO {
    private int num;
    private String name;
    private int kor;
    private int math;
    private int eng;
    private Date regdate;

    public StudentDTO(){}

    public StudentDTO(int num, String name, int kor, int math, int eng) {
        this.num = num;
        this.name = name;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
        this.regdate = new Date();
    }

    public StudentDTO(int num, String name, int kor, int math, int eng, Date regdate) {
        this.num = num;
        this.name = name;
        this.kor = kor;
        this.math = math;
        this.eng = eng;
        this.regdate = regdate;
    }
    public int getNum() {
        return this.num;
    }
    public void setNum(int num) {
        this.num = num;
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
    public int getMath() {
        return this.math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public int getEng() {
        return this.eng;
    }
    public void setEng(int eng) {
        this.eng = eng;
    }
    public Date getRegdate() {
        return this.regdate;
    }
    public void setRegdate(Date regdate) {
        this.regdate = regdate;
    }
    @Override
    public String toString() {
        return "{" +
            " num='" + getNum() + "'" +
            ", name='" + getName() + "'" +
            ", kor='" + getKor() + "'" +
            ", math='" + getMath() + "'" +
            ", eng='" + getEng() + "'" +
            ", regdate='" + getRegdate() + "'" +
            "}";
    }
}
