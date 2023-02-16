
public class Apartment extends Residential{
	private int numRentableUnits;
	private double avgUnitSize;
	
	
	
	public Apartment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, int numRentableUnits, double avgUnitSize) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
	}
	public void draw() {
		System.out.println("Drawing code: ");
	}
	public String displayData() {
		System.out.println("======Display======\n" + this.toString());
		this.toString();
		return toString();
	}
	@Override
	public String toString() {
		return  "Apartment \nProject Name: " + projectName + "\nAddress: " + completeAddress + "\nTotal Square Footage: " + totalSquareFeet
				+ "\nOccupancy Group: " + occupancyGroup + "\nSubgroup: " + subgroup + "\nRentable Units" + numRentableUnits + "\nUnit Size: " + avgUnitSize + "\nBedrooms: "
						+ numBedrooms + "\nBathrooms: " + numBathrooms + "\nLaundry Room: " + laundryRoom+ "\n ";
	}
	
	
}
