import java.io.*;

public class Customer implements Serializable{

	private String username;
	private String password;
	private Quote quote;
	
	public Customer(String username, String password, Quote quote) {
		super();
		this.username = username;
		this.password = password;
		this.quote = quote;
	}

	public Customer(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Quote getQuote() {
		return quote;
	}

	public void setQuote(Quote quote) {
		this.quote = quote;
	}

	@Override
	public String toString() {
		
		String s = "\n" + username;
		if(quote != null){
			s += "\t\t" + quote.getPrice() + "\t\t" + quote.getHouse().getName() + "\t" + quote.getSubContractor().getName(); 
		}
		return s;
	}
	
}
