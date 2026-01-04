
interface Vehicle{

    String Break();
    String SpeeUp();
    String SlowDown();

    default String NavigationOn(){
        return "Navigation Mode is turned on";
    }

    default String ConnectToMobile(){
        return "Connected to Mobile";
    }

    static String getCompanyName(){
        return "BMW";
    }
}

class Car implements Vehicle{

    @Override
    public String Break() {
        return "Break is applied";
    }

    @Override
    public String SpeeUp() {
        return "Speeding Up";
    }

    @Override
    public String SlowDown() {
        return "Slowing Down";
    }
}

public class DefaultStaticMethodDemo {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.Break());
        System.out.println(car.SpeeUp());
        System.out.println(car.SlowDown());

        System.out.println(car.NavigationOn());
        System.out.println(car.ConnectToMobile());

        System.out.println(Vehicle.getCompanyName());

    }

}
