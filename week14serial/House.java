import java.io.*;
import java.util.ArrayList;

public class House implements Serializable {
	
	protected String name = "";
	protected int materialCost = 0;
	protected int squareFootage = 0;
	protected ArrayList<Room> rooms;
	
	public House(String name, int materialCost, int squareFootage, ArrayList<Room> rooms) {
		super();
		this.name = name;
		this.materialCost = materialCost;
		this.squareFootage = squareFootage;
		this.rooms = rooms;
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}

	public int getMaterialCost() {
		return materialCost;
	}
	public void setMaterialCost(int materialCost) {
		this.materialCost = materialCost;
	}
	public int getSquareFootage() {
		return squareFootage;	
	}
	public void setSquareFootage(int squareFootage) {
		this.squareFootage = squareFootage;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "House [name=" + name + ", materialCost=" + materialCost	
				+ ", squareFootage=" + squareFootage + ", rooms=" + rooms + "]";
	}

	
	
}
