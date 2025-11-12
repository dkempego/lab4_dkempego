public class DkempegoMain {
    public static void main(String[] args) {
        String vi = System.getProperty("vi"); 
        IVehicle[] vehicles = new IVehicle[]{
            new Car("Black", 2010),
            new Van(5000, 6),
            new Motorbike(100, "TVS")
        };
        int total = new DkempegoVehicleService(vi).calculateTotal(vehicles);
        System.out.println("Total Service Charge: $" + total);
    }
}