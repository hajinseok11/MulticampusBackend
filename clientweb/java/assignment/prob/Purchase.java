﻿import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Purchase {
	// TODO : 멤버 변수를 선언합니다. (nameOfProduct, totalStockOfPack)

	public static void main(String[] args) throws Exception {
		Purchase purchase = new Purchase();

		Product product = purchase.getProduct();
		double totalPrice = purchase.calcTotalPrice(product);

		StringBuffer sb = new StringBuffer();
		// TODO : 프린트할 결과 문장을 변수 sb에 append 합니다.
		sb.append("구매하려는 상품코드를 선택하세요.");
		sb.append("상품팩에 포함된 상품의 개수, 상품팩의 가격을 순서대로 입력하세요(구분자:,)");
		sb.append("구매하려는 상품팩의 개수를 입력하세요?");
		
	
		System.out.println(sb.toString());
	}

	public Product getProduct() throws Exception {
	// TODO : 사용자로부터 상품코드, 상품팩에 포함된 상품 개수, 상품팩 가격, 구매할 상품팩의 개수를 
	// 입력받아 Product 객체를 리턴합니다.
		Scanner scan = new Scanner(System.in);
		int productCode = scan.nextInt();
		product.setProductCode(productCode);
		String purchaseNumPrice = scan.nextLine();
		Product.set
		int purchsePackNum = scan.nextInt();
		

		return Product();

	}

	public double calcTotalPrice(Product product) throws Exception {
		// TODO : Product 객체로부터 필요한 정보를 추출하여 재고량을 체크하고, 지불해야 할 총 금액을 리턴합니다.
                // 재고량이 부족할 경우 -1을 리턴합니다.
	}
}
