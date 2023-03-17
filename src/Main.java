import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Car, DataCars> carMap=new HashMap<>();
        Car car1=new Car(4455,12);

        DataCars dataCars1=new DataCars(2022,"Tesla",95000,"Dark");
        carMap.put(car1,dataCars1);

        Car car2=new Car(5544,999);
        DataCars dataCars2=new DataCars(2020,"Lexus",75000,"Black");

        carMap.put(car2,dataCars2);

        for(Map.Entry<Car, DataCars>entry:carMap.entrySet()){
            Car car=entry.getKey();
            DataCars dataCars=entry.getValue();

            System.out.println("************************************************************");
            System.out.println("Car ID: " + car.getId() + ", Car Number: " + car.getNuber());
            System.out.println("Year of Manufacture: "+dataCars.getYearsOfManufacture());
            System.out.println("Model: "+dataCars.getModel());
            System.out.println("Price: "+dataCars.getPrice());
            System.out.println("color: "+dataCars.getColors());
        //    System.out.println("************************************************************");

        }

    }
}