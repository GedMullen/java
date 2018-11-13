public class Quote {

	private House house;
	private SubContractor subContractor;
	private int price = 0;
	
	public Quote(House house, SubContractor subContractor, int price) {
		super();
		this.house = house;
		this.subContractor = subContractor;
		this.price = price;
	}

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	public SubContractor getSubContractor() {
		return subContractor;
	}

	public void setSubContractor(SubContractor subContractor) {
		this.subContractor = subContractor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Quote [house=" + house + ", subContractor=" + subContractor + ", price=" + price + "]";
	}
	
}
