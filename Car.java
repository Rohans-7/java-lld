public class Car{
    private String engine;
    private int wheels;
    private int seats;

    private Car(CarBuilder builder){
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.seats  = builder.seats;
    }

    public String getEngine(){
        return engine;
    }

    public int getWheels(){
        return wheels;
    }

    public int getSeats(){
        return seats;
    }

    public String toString(){
        return engine + " " + wheels + " " + seats;
    }

    public static class CarBuilder{
        private String engine;
        private int wheels;
        private int seats;

        public CarBuilder setEngine(String engine){
            this.engine = engine;
            return this;
        }

        public CarBuilder setWheels(int wheels){
            this.wheels = wheels;
            return this;
        }

        public CarBuilder setSeats(int seats){
            this.seats = seats;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}