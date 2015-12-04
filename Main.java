/**
 * Created by ulihtenshtein on 02.12.15.
 */
public class Main {

    protected static void constructGoldCar(IBuilder builder)
    {

        builder.buildWheel(ICar.Position.FRONT_RIGHT, ICar.TypeWheel.WHEEL_D19);
        builder.buildWheel(ICar.Position.FRONT_LEFT, ICar.TypeWheel.WHEEL_D19);
        builder.buildWheel(ICar.Position.BACK_RIGHT, ICar.TypeWheel.WHEEL_D22);
        builder.buildWheel(ICar.Position.BACK_LEFT, ICar.TypeWheel.WHEEL_D22);
        builder.buildBody(ICar.Colour.GOLD);
        builder.buildSteeringGearl(ICar.TypeSteeringGearl.STEERING_GEARL_HYDRO);
        builder.buildEngine(ICar.TypeEngine.ENGINE_V2_4L);
        try
        {
            builder.buidTransmission(ICar.TypeTransmission.TRANSMISSION_AUTO);
        } catch (Exception e)
        {
            builder.buidTransmission(ICar.TypeTransmission.TRANSMISSION_MECH);
        }
        builder.buildSpoiler(ICar.Colour.GOLD);

    }
    public static void main(String[] args)
    {
        try
        {
            IBuilder mersBuilder = BuilderFactory.getMersBuilder();
            IBuilder vazBuilder = BuilderFactory.getVazBuilder();
            constructGoldCar(mersBuilder);
            constructGoldCar(vazBuilder);
            ICar carMers = mersBuilder.getCar();
            ICar carVaz = vazBuilder.getCar();
                System.out.println(carMers);
                System.out.println(carVaz);
        } catch (Exception e)
        {
            System.out.println("error:" + e.getMessage());
        }
    }
}
