
public class Residential extends Building {
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean  laundryRoom;
	
	
	public Residential() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	}
	public void draw() {
		System.out.println("Drawing code: ");
	}
	public String displayData() {
		System.out.println("==========Display===========\n" + this.toString());
		this.toString();
		return toString();
	}
	@Override
	public String toString() {
		return  "Residential \nProject Name: " + projectName + "\nAddress: " + completeAddress
				+ "\nTotal Square Footage: " + totalSquareFeet + "\nOccupancy: " + occupancyGroup + "Subgroup: "
				+ subgroup + "\nBedrooms: " + numBedrooms + "\nBathrooms: " + numBathrooms + "\nLaundry: "
						+ laundryRoom+ "\n ";
	}
	
}
