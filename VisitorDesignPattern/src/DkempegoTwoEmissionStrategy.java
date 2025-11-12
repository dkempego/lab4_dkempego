public class DkempegoTwoEmissionStrategy implements IEmissionsStrategy {
    @Override
    public int computeEmissionsFee(IVehicle vehicle) {
        float fee = vehicle.co2Emissions() - 1100f;
        return (int)Math.min(fee, 10f);
    }
}
