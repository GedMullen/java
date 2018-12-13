import java.io.*;

public class SubContractor implements Serializable{

	private String name = "";
	private boolean isVetted = true;
	private boolean isAvailable = true;
	
	public SubContractor(String location, boolean isVetted, boolean isAvailable) {
		super();
		this.name = location;
		this.isVetted = isVetted;
		this.isAvailable = isAvailable;
	}

	public String getName() {
		return name;
	}

	public void setName(String location) {
		this.name = location;
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
		return "SubContractor [name=" + name + ", isVetted=" + isVetted + ", isAvailable=" + isAvailable + "]";
	}
	
	
	
}
