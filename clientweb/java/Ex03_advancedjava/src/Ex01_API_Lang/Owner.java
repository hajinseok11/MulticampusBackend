package Ex01_API_Lang;
import java.util.Objects;

public class Owner {
	String name;
	String cellPhone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public Owner(String name, String cellPhone) {
		super();
		this.name = name;
		this.cellPhone = cellPhone;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Owner other = (Owner) obj;
		return this.name.equals(other.name);
	}
	@Override
	public String toString() {
		return "이름은" + name + "이고, 핸드폰 번호는 " + cellPhone + "입니다" ;
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(cellPhone, name);
	}

}