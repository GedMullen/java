package inheritance;

public class Address {

	private String nameOrNumber = "";
	private String street = "";
	private String town = "";
	private String postCode = "";
	
	public Address(String nameOrNumber, String street, String town, String postCode) {
		super();
		this.nameOrNumber = nameOrNumber;
		this.street = street;
		this.town = town;
		this.postCode = postCode;
	}

	@Override
	public String toString() {
		return "Address [nameOrNumber=" + nameOrNumber + ", street=" + street + ", town=" + town + ", postCode="
				+ postCode + "]";
	}


	
}
