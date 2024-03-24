package oopInheritance;


public class Wheeler {
	protected int velocity;
	protected String carName;
	protected int wheelNumber;

	public Wheeler(int velocity, String carName, int wheelNumber) {
		super();
		this.velocity = velocity;
		this.carName = carName;
		this.wheelNumber = wheelNumber;
	}

	public void speedUp(int speed) {
		System.out.println("속도가"+speed+"만큼 증가합니다");

	}
	public void speedDown(int speed) {
		System.out.println("속도가"+speed+"만큼 감소합니다");
	}
	public void stop() {
		velocity = 0;
		System.out.println("정지상태로 속도를 0으로 초기화합니다.");
	}

}