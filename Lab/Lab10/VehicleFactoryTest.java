public class VehicleFactoryTest{
	
	public static void main(String[] args){
		
	

     	Vehicle v1 = VehicleFactory.getVehicle("Car");
		System.out.println(v1.move());
		Vehicle v2 = VehicleFactory.getVehicle("Truck");
		System.out.println(v2.move());
	
	
	
	}
}