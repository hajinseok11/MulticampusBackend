public class Student {
	private String name;
	private String subject;
	private int fee;
	private double returnFee;

	public Student(){}
	public Student(String name, String subject, int fee) {
		this.name = name;
		this.subject = subject;
		this.fee = fee;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getFee() {
		return this.fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public double getReturnFee() {
		return this.returnFee;
	}
	public void setReturnFee(double returnFee) {
		this.returnFee = returnFee;
	}

	public void calcReturnFee(){
		if (subject.equals("javaprogram")){
			returnFee = fee * 0.25; 
		} else if (subject.equals("jspprogram")){
			returnFee = fee * 0.2;
		} else {
			System.out.println("그런 과정명은 없습니다");
        }
	}
    
	public void print(){
		System.out.printf("%s씨의 과정명은 %s이고 교육비는 %d이며 환급금은 %.2f입니다.",getName(),getSubject(),getFee(),getReturnFee());
		
	}
}


