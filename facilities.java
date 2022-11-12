public class facilities {
	boolean hasWifi;
	boolean hasBar;
	boolean isHandicapAccessible;

	/**
	  Constructor for facilities class 
	  */
	
	public facilities() {}
	
	public facilities(boolean hasWifi, boolean hasBar, boolean isHandicapAccessible) {
		this.hasWifi = hasWifi;
		this.hasBar = hasBar;
		this.isHandicapAccessible = isHandicapAccessible;
	}

	/**
	 * returns only available facilites  
	 * */
	public void setFacilities(boolean hasWifi, boolean hasBar, boolean isHandicapAccessible) {
		if(hasWifi == true) 
			System.out.println("Wifi");
		
		if(hasBar == true)
			System.out.println("Bar");
		
		if(isHandicapAccessible == true)
			System.out.println("Handicap Accessible");
		
	}
	
}
