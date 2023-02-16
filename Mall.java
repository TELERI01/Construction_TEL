
public class Mall extends Business {
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	public Mall() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numRentableUnits, int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentableUnits);
		this.numRentedUnits = numRentedUnits;
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;
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
		return "Mall" + "\nProject Name: " + projectName + " \nComplete Address: " + completeAddress
				+ "\nTotal Square Feet: " + totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nSub Group: "
				+ subgroup + "\nNumber of Rented units: " + numRentedUnits + "\nMedian Unit Size: " + medianUnitSize + "\nNumber Parking Spaces: "
						+ numParkingSpaces;
	}
	
}
