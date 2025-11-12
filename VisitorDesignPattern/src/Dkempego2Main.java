public class Dkempego2Main {
    public static void main(String[] args) {
        IVehicle[] vehicles = new IVehicle[]{
            new Car("Black", 2010),
            new Van(5000, 6),
            new Motorbike(100, "TVS")
        };
        int total = Dkempego2VehicleService.getInstance().calculateTotal(vehicles);
        System.out.println("Total Service Charge: $" + total);
    }
}

