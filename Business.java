
public class Business extends Building {
	protected int numRentableUnits;
	
	public Business() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numRentableUnits) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits = numRentableUnits;
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
		return  "Business \nProject Name: " + projectName + "\nAddress: "
				+ completeAddress + "\nTotal Square Footage: " + totalSquareFeet + "\nOccupancy Group: " + occupancyGroup
				+ "\nSubgroup: " + subgroup + "\nRentable Units: " + numRentableUnits + "\n ";
	}
	
	
	
	
	
}
