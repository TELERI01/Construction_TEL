/**
 * This is the parent object of all the inherited classes in the project
 * @author tylerlericos
 * @version 4.25
 * Lab Construction
 * CS131
 */
public class Building {
	
	protected String projectName; //Project Name
	protected String completeAddress; // String Complete Address
	protected double totalSquareFeet; // Type double Total square Feet
	protected String occupancyGroup; // Occupancy Group
	protected String subgroup; // Subgroup
	/**
	 * Empty Constructor
	 */
	public Building() {
	}
	/**
	 * Preferred Construcor
	 * @param projectName //Stores string
	 * @param completeAddress //Stores string for address
	 * @param totalSquareFeet // Stores a double for total Squarefootage
	 * @param occupancyGroup // Stores a string for occupancy group
	 * @param subgroup // Stores a string for subgroup
	 */
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}
	/**
	 * Getter
	 * @return project name
	 */
	public String getProjectName() {
		return projectName;
	}
/**
 * set project name
 * @param projectName
 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
/**
 * Getter
 * @return address
 */
	public String getCompleteAddress() {
		return completeAddress;
	}
	
	/**
	 * Setter
	 * @param completeAddress
	 */
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}
	/**
	 * Getter
	 * @return total square feet
	 */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}
	/**
	 * Setter
	 * @param totalSquareFeet
	 */
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}
	/**
	 * Getter
	 * @return occupancy group
	 */
	public String getOccupancyGroup() {
		return occupancyGroup;
	}
	/**
	 * Setter
	 * @param occupancyGroup
	 */
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}
	/**
	 * Getter
	 * @return subgroup
	 */
	public String getSubgroup() {
		return subgroup;
	}
	/**
	 * Setter
	 * @param subgroup
	 */
	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}
	/**
	 * public draw method
	 */
	public void draw() {
		System.out.println("Drawing code: ");
	}
	/**
	 * Display method
	 * @return 
	 */
	public String displayData() {
		System.out.println("======Display======\n" + this.toString());
		this.toString();
		return toString();
	}
	/**
	 * Override toString method
	 */
	@Override
	public String toString() {
		return "Building \nProject Name: " + projectName + "\nComplete Address: " + completeAddress + "\nTotal Square Feet: "
				+ totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nSubgroup: " + subgroup+ "\n ";
	}
	
	
	
}

