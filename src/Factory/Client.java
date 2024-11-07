package Factory;

public class Client {
    public static void main(String[] args) {

//      VehicleFactory vf=new VehicleFactory();
//      Vehicle v= vf.getVehicle("bike");
//      v.start();

        // without factory
        Vehicle v=new Scooter();
        Vehicle v1=new Bike();

        //with factory
        Vehicle bike = VehicleFactory.getVehicle("bike");
        bike.start();
    }
}
