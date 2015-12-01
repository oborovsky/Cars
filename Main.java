/**
 * Created by ulihtenshtein on 02.12.15.
 */
public class Main {

    public static void main(String[] args)
    {
        try
        {
//            AbsCarFactory aFactory = new MersCarFactory();
//            AbsCarFactory aFactory2 = new AutoVazCarFactory();
//
//            System.out.println("2" + ICar.TypeWheel.WHEEL_D17);
//            IProduct aProduct = aFactory.make(ICar.TypeWheel.WHEEL_D17.name());
//            IProduct aProduct2 = aFactory2.make(ICar.TypeEngine.ENGINE_V1_6L.name());
//            System.out.println("3" + aProduct +"\n" + aProduct2);
            ICar carMers = new MersCar(ICar.Colour.YELLOW, ICar.TypeEngine.ENGINE_V3_2L, ICar.TypeTransmission.TRANSMISSION_AUTO, ICar.TypeSteeringGearl.STEERING_GEARL_HYDRO, ICar.TypeWheel.WHEEL_D19);
            ICar carVaz = new AutoVazCar(ICar.Colour.GOLD, ICar.TypeEngine.ENGINE_V2_4L, ICar.TypeTransmission.TRANSMISSION_MECH, ICar.TypeSteeringGearl.STEERING_GEARL_HYDRO, ICar.TypeWheel.WHEEL_D19);
                System.out.println(carMers);
                System.out.println(carVaz);
        } catch (Exception e)
        {
            System.out.println("error:" + e.getMessage());
        }
    }
}
