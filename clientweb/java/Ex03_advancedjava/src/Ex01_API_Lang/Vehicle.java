package Ex01_API_Lang;

import java.util.Objects;

public class Vehicle {
	private Owner owner;
	private int price;
	
	public Vehicle(Owner owner, int price) {
		super();
		this.owner = owner;
		this.price = price;
	}
	public Vehicle() {
		
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "소유주정보: 이름은" + owner.name + "이고, 핸드폰 번호는 " + owner.cellPhone + "입니다" +"\n"
	+"차량정보: 가격은" + price + "입니다." ;
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(owner);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle)obj;
		return this.owner.equals(other.owner);
	}

}




