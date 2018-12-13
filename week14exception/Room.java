import java.io.*;
import java.util.ArrayList;

public class Room implements Serializable{
	
	private String type = "";
	private ArrayList<Component> components = new ArrayList<Component>();
	
	public Room(String type, ArrayList<Component> components) {
		super();
		this.type = type;
		this.components = components;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public ArrayList<Component> getComponents() {
		return components;
	}

	public void setComponents(ArrayList<Component> components) {
		this.components = components;
	}

	@Override
	public String toString() {
		String s = "\n" + type;
		s += "\nComponents";
		for (Component component : components) {
			s+=component.toString();
		}
		return s;
	}
	
	
	
	

}
