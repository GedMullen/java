import java.util.ArrayList;

public class Timber extends House {

	private String type = "";
	
	public Timber(String name, int materialCost, int squareFootage, ArrayList<Room> rooms, String type) {
		super(name, materialCost, squareFootage, rooms);
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
		return "Timber [type=" + type + ", materialCost=" + materialCost + ", squareFootage=" + squareFootage + ", rooms=" + rooms + "]";
	}


}
