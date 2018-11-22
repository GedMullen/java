
public class Component {

	private String type = "";

	public Component(String type) {
		super();
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Component [type=" + type + "]";
	}
	
}
