public class Main
{
	public static void main(String[] args) {
		// Vehicle tata = VehicleFactory.getVehicle("Car");
        // tata.start();
        // tata.stop();
		Car.CarBuilder builder = new Car.CarBuilder();
		Car car1 = builder.setEngine("V8")
						  .setWheels(4)
						  .setSeats(4).build();

		System.out.println(car1);
	}
}