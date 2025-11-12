public class VehicleFactory {
     private VehicleFactory() {}
    public static IVehicleInspector getVehicleInspector(String prop) {
        if ("asu".equalsIgnoreCase(prop)) {
            return new DkempegoVehicleInspection();
        }
        return new VehicleInspection();
    }
}
