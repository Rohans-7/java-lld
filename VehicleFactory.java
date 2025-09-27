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

class Car implements Vehicle{
    public void start(){
        System.out.println("Starting the Car");
    }
    public void stop(){
        System.out.println("Stop the Car");
    }
    public void type(){
        System.out.println("This is tata Car");
    }
}

public class VehicleFactory{
    public static Vehicle getVehicle(String s){
        if(s.equals("Car")){
            return new Truck();
        }
        else if(s.equals("Truck")){
            return new Truck();
        }
        return new Truck();
    }
}