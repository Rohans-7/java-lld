public class Main
{
	public static void main(String[] args) {
		Vehicle tata = VehicleFactory.getVehicle("Car");
        tata.start();
        tata.stop();
	}
}