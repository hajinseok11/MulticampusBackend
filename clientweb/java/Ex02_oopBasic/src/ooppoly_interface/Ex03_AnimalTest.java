package ooppoly_interface;

public class Ex03_AnimalTest {
	public static void main(String[] args) {
		Animal dog = new Dog(8);
		Animal chicken = new Chicken(3);
		Chicken cheatableChicken = new Chicken(5);
		if(cheatableChicken instanceof Chicken){
			System.out.println("test");
			cheatableChicken.fly();
			
		// 메인 메소드에 코드를 추가해서 도그와 치킨의 이동거리를 출력해주세요
		
		for(int i = 1; i <= 3; i++){

			dog.run(1);
			chicken.run(1);
			cheatableChicken.run(1);
			System.out.println(i+"시간 후");
			System.out.println(i+"개의 이동거리 = " + dog.getDistance());
			System.out.println(i+"닭의 이동거리 = " + chicken.getDistance());
			System.out.println(i+"날으는 닭의 이동거리 = " + cheatableChicken.getDistance());
		}
		}
	}
}












