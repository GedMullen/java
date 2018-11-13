public class SubContractor {

	private String location = "";
	private boolean isVetted = true;
	private boolean isAvailable = true;
	
	public SubContractor(String location, boolean isVetted, boolean isAvailable) {
		super();
		this.location = location;
		this.isVetted = isVetted;
		this.isAvailable = isAvailable;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isVetted() {
		return isVetted;
	}

	public void setVetted(boolean isVetted) {
		this.isVetted = isVetted;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	@Override
	public String toString() {
		return "SubContractor [location=" + location + ", isVetted=" + isVetted + ", isAvailable=" + isAvailable + "]";
	}
	
	
	
}
