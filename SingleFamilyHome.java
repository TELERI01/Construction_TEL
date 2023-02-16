
public class SingleFamilyHome extends Residential {
	private boolean garage;
	
	
	public SingleFamilyHome() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		this.garage = garage;
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
		return "SingleFamilyHome \nProject Name: " + projectName + "\nAddress: "
				+ completeAddress + "\nTotal Square Footage: " + totalSquareFeet + "\nOccupancy Group: " + occupancyGroup
				+ "\nSubgroup: " + subgroup + "\nBedrooms: " +numBedrooms + "\nLaundry Room: " + laundryRoom + "\nGarage: " +garage + "\n";
	}
	
	
}
