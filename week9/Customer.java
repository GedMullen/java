public class Customer {

	private String username;
	private String password;
	private Quote quote;
	
	public Customer(String username, String password, Quote quote) {
		super();
		this.username = username;
		this.password = password;
		this.quote = quote;
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
		return "Customer [username=" + username + ", password=" + password + ", quote=" + quote + "]";
	}
	
}
