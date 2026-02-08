package StructuralDPs;

import java.util.HashMap;
import java.util.Map;

public class BikeFactory {
    private static final Map<String,Bike> bikeMap = new HashMap<>();

    static Bike getBike(String model, int engineCC){
       String key = model+"-"+engineCC;
       Bike bike = bikeMap.get(key);

       if(bike==null){
           bike = new Honda(model,engineCC);
           bikeMap.put(key,bike);
           System.out.println("Creating new honda bike"+model+" "+engineCC);
       }
       return bike;
    }
}
