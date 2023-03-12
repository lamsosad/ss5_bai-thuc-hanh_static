package static_property;

public class Bai2 {
    public static void main(String[] args) {
        Car car1= new Car("VinFast","VF8");
        System.out.println(Car.numberOfCars);
        Car car2= new Car("VinFast","VFe34");
        System.out.println(Car.numberOfCars);
    }

}
