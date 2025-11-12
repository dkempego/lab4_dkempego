public class DkempegoOneEmissionsStrategy implements IEmissionsStrategy {
    @Override
    public int computeEmissionsFee(IVehicle vehicle) {
        float fee = vehicle.co2Emissions() - 1000f;
        return (int)Math.min(fee, 0f);
    }
}
