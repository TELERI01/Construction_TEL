/**
 * 
 * @author tylerlericos
 *
 */
public class Building {
	
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;
	
	public Building() {
	}
	
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}
	
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getCompleteAddress() {
		return completeAddress;
	}

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	public String getOccupancyGroup() {
		return occupancyGroup;
	}

	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}

	public String getSubgroup() {
		return subgroup;
	}

	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
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
		return "Building \nProject Name: " + projectName + "\nComplete Address: " + completeAddress + "\nTotal Square Feet: "
				+ totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nSubgroup: " + subgroup+ "\n ";
	}
	
	
	
}
