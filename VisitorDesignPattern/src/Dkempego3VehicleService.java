public class Dkempego3VehicleService {
    private static final Dkempego3VehicleService INSTANCE;
    private final IVehicleInspector inspector;
    private final IEmissionsStrategy emissionsStrategy;

    static {
        String vi = System.getProperty("vi");
        String es = System.getProperty("es"); 
        IVehicleInspector injInspector = VehicleFactory.getVehicleInspector(vi);

        IEmissionsStrategy strategy;
        if ("one".equalsIgnoreCase(es)) {
            strategy = new DkempegoOneEmissionsStrategy();
        } else if ("two".equalsIgnoreCase(es)) {
            strategy = new DkempegoTwoEmissionStrategy();
        } else {
            strategy = new DkempegoNullEmissionsStrategy();
        }
        INSTANCE = new Dkempego3VehicleService(injInspector, strategy);
    }

    private Dkempego3VehicleService(IVehicleInspector inspector, IEmissionsStrategy emissionsStrategy) {
        this.inspector = inspector;
        this.emissionsStrategy = emissionsStrategy;
    }

    public static Dkempego3VehicleService getInstance() { return INSTANCE; }

    public int calculateTotal(IVehicle[] vehicles) {
        int total = 0;
        for (IVehicle v : vehicles) {
            total = total + emissionsStrategy.computeEmissionsFee(v) + v.accept(inspector);
        }
        return total;
    }
}
