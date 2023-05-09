interface Vehicle{
	public String move();
}

class Car implements Vehicle{

	public Car(){
	
	}
	
	@Override
	public String move(){
		return "Car is moving";
		
	}
}

class Truck implements Vehicle{
	
	public Truck(){
		
	}
	
	@Override
	public String move(){
		
		return "Truck is moving";
	}
}