interface Vehicle{
    void start();
    void stop();
    default void type(){
        System.out.println("This is a vehicle");
    }
    // After java 8 there can be a default method in java,
    // the simple reason was to keep them backward competable
}

class Truck implements Vehicle{
    public void start(){
        System.out.println("Starting the truck");
    }
    public void stop(){
        System.out.println("Stop the truck");
    }
    public void type(){
        System.out.println("This is tata truck");
    }
}

public class Main
{
	public static void main(String[] args) {
		Truck tata = new Truck();
		tata.start();
		tata.stop();
		tata.type();
	}
}