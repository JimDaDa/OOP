class VehicleFactory{
	private VehicleFactory(){
		
	}
	
	public static final Vehicle getVehicle(String type){
		
		switch (type){
			
			case "Car":
			
				return new Car();
				
			case "Truck":
			
				return new Truck();
				
			default:
			
				throw new IllegalArgumentException("This vehicle type is unsupported");
		}
	}
}