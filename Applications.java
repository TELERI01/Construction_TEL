
public class Applications {

	public static void main(String[] args) {
		//==================================================================================================================================
		Building building1 = new Building("Gaines House", "123 Main Street | Louisville", 2540, "Residential/Building", "R1");
		//display data method
		building1.displayData();
		//Setters
		building1.setProjectName("Jane's House");
		building1.setCompleteAddress("333 Goober Lane");
		building1.setTotalSquareFeet(3045);
		building1.setOccupancyGroup("ResidentialGroup");
		building1.setSubgroup("R2");
		//Getters
		building1.getProjectName();
		building1.getCompleteAddress();
		building1.getTotalSquareFeet();
		building1.getOccupancyGroup();
		building1.getSubgroup();
		
		System.out.println("Second Set of Data: ");
		building1.displayData();
		
		
		//==================================================================================================================================
		
		Mall mall1 = new Mall("Gaines House", "123 Main Street | Louisville", 2540, "Mall","R2",1 , 1, 2.2,3);
		//display data method
		mall1.displayData();
		
		//Setters
		mall1.setProjectName("Jane's House");
		mall1.setCompleteAddress("333 Goober Lane");
		mall1.setTotalSquareFeet(3045);
		mall1.setOccupancyGroup("ResidentialGroup");
		mall1.setSubgroup("R2");
		//Getters
		mall1.getProjectName();
		mall1.getCompleteAddress();
		mall1.getTotalSquareFeet();
		mall1.getOccupancyGroup();
		mall1.getSubgroup();
		
		System.out.println("Second Set of Data: ");
		mall1.displayData();
		//==================================================================================================================================
		Business business1 = new Business("Gaines House", "123 Main Street | Louisville", 2540, "Business", "R3", 1);
		//display data method
		business1.displayData();
		//Setters
		business1.setProjectName("Jane's House");
		business1.setCompleteAddress("333 Goober Lane");
		business1.setTotalSquareFeet(3045);
		business1.setOccupancyGroup("ResidentialGroup");
		business1.setSubgroup("R2");
		//Getters
		business1.getProjectName();
		business1.getCompleteAddress();
		business1.getTotalSquareFeet();
		business1.getOccupancyGroup();
		business1.getSubgroup();
		
		System.out.println("Second Set of Data: ");
		business1.displayData();
		//==================================================================================================================================
		Residential residential1 = new Residential("Gaines House", "123 Main Street | Louisville", 2540, "Residential", "R4",1,1,true );
		//display data method
		residential1.displayData();	
		//Setters
		residential1.setProjectName("Jane's House");
		residential1.setCompleteAddress("333 Goober Lane");
		residential1.setTotalSquareFeet(3045);
		residential1.setOccupancyGroup("ResidentialGroup");
		residential1.setSubgroup("R2");
		//Getters
		residential1.getProjectName();
		residential1.getCompleteAddress();
		residential1.getTotalSquareFeet();
		residential1.getOccupancyGroup();
		residential1.getSubgroup();
		
		System.out.println("Second Set of Data: ");
		residential1.displayData();
		//==================================================================================================================================
		Apartment apartment1 = new Apartment("Gaines House", "123 Main Street | Louisville", 2540, "Apartment", "R5",1,2,true,12,1);
		//display data method
		apartment1.displayData();
		//Setters
		apartment1.setProjectName("Jane's House");
		apartment1.setCompleteAddress("333 Goober Lane");
		apartment1.setTotalSquareFeet(3045);
		apartment1.setOccupancyGroup("ResidentialGroup");
		apartment1.setSubgroup("2");
		//Getters
		apartment1.getProjectName();
		apartment1.getCompleteAddress();
		apartment1.getTotalSquareFeet();
		apartment1.getOccupancyGroup();
		apartment1.getSubgroup();
		
		System.out.println("Second Set of Data: ");
		apartment1.displayData();
		//==================================================================================================================================
		SingleFamilyHome home1 = new SingleFamilyHome("Gaines House", "123 Main Street | Louisville", 2540, "Single Family Home", "R6",1,2,true,false);
		//display data method
		home1.displayData();
		//Setters
		home1.setProjectName("Jane's House");
		home1.setCompleteAddress("333 Goober Lane");
		home1.setTotalSquareFeet(3045);
		home1.setOccupancyGroup("ResidentialGroup");
		home1.setSubgroup("R2");
		//Getters
		home1.getProjectName();
		home1.getCompleteAddress();
		home1.getTotalSquareFeet();
		home1.getOccupancyGroup();
		home1.getSubgroup();
		
		System.out.println("Second Set of Data: ");
		home1.displayData();
		
		//==================================================================================================================================

	}

}
