import java.util.ArrayList;

public class Timber extends House {

	private String type = "";
	
	public Timber(int materialCost, int numberOfRooms, int squareFootage, ArrayList<Room> rooms, String type) {
		super(materialCost, numberOfRooms, squareFootage, rooms);
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
		return "Timber [type=" + type + ", materialCost=" + materialCost + ", numberOfRooms=" + numberOfRooms
				+ ", squareFootage=" + squareFootage + ", rooms=" + rooms + "]";
	}


}
