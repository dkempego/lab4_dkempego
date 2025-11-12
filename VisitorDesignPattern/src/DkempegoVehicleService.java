public class DkempegoVehicleService {
    private final IVehicleInspector inspector;

    public DkempegoVehicleService(String viProp) {
        this.inspector = VehicleFactory.getVehicleInspector(viProp);
    }

    public int calculateTotal(IVehicle[] vehicles) {
        int total = 0;
        for (IVehicle v : vehicles) {
            total += v.accept(inspector);
        }
        return total;
    }
}

