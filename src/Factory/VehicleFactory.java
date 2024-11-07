package Factory;

public class VehicleFactory {

    public static Vehicle getVehicle(String type){
        if(type.trim().equalsIgnoreCase("bike")){
            return new Bike();
        }else if (type.trim().equalsIgnoreCase("scooter")){
            return new Scooter();
        }else{
            return null;
        }
    }
}
