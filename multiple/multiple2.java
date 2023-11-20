public class multiple2 {
    public static void main(String[] args) {
        // Using interface variables in multiple inheritance
        Car myCar = new Car();
        myCar.start();
        myCar.cool();
    }
}
interface Engine {
    String ENGINE_TYPE = "Internal Combustion";  // Constant variable

    void start();
}

// Interface with a variable
interface AirConditioner {
    String AC_TYPE = "Manual";  // Constant variable

    void cool();
}

// Class implementing both interfaces
class Car implements Engine, AirConditioner {
    @Override
    public void start() {
        System.out.println("Car started with " + ENGINE_TYPE + " engine");
    }

    @Override
    public void cool() {
        System.out.println("Air conditioning is on with " + AC_TYPE + " controls");
    }
}
