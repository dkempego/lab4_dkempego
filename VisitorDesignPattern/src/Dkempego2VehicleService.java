public class Dkempego2VehicleService {
    private static final Dkempego2VehicleService INSTANCE;
    private final IVehicleInspector inspector;
    static {
        String vi = System.getProperty("vi");
        IVehicleInspector injected = VehicleFactory.getVehicleInspector(vi);
        INSTANCE = new Dkempego2VehicleService(injected);
    }

    private Dkempego2VehicleService(IVehicleInspector inspector) {
        this.inspector = inspector;
    }

    public static Dkempego2VehicleService getInstance() {
        return INSTANCE;
    }

    public int calculateTotal(IVehicle[] vehicles) {
        int total = 0;
        for (IVehicle v : vehicles) {
            total += v.accept(inspector);
        }
        return total;
    }
}
