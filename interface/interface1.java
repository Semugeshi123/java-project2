public class interface1{
    public static void main(String[] args) {
        // Interface inheritance chain in hierarchical interfaces
        ElectricCar myElectricCar = new ElectricCar();
        myElectricCar.start();
        myElectricCar.cool();
        myElectricCar.charge();
    }
}
interface Vehicle {
    void start();
}

// Interface extending the base interface
interface AirConditioner extends Vehicle {
    void cool();
}

// Interface extending the AirConditioner interface
interface ElectricVehicle extends AirConditioner {
    void charge();
}

// Class implementing the extended interface
class ElectricCar implements ElectricVehicle {
    @Override
    public void start() {
        System.out.println("Electric car started");
    }

    @Override
    public void cool() {
        System.out.println("Air conditioning is on");
    }

    @Override
    public void charge() {
        System.out.println("Electric car charging");
    }
}
