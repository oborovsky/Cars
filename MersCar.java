import java.util.HashMap;

/**
 * Created by ulihtenshtein on 02.12.15.
 */
public class MersCar extends AbsCar {
    public MersCar(ICar.Colour colour, ICar.TypeEngine typeEngine, ICar.TypeTransmission typeTransmission, ICar.TypeSteeringGearl typeSteeringGearl, ICar.TypeWheel typeWheel)
    {
        mName = "Mersedes-Benz";
        mWheels = new HashMap<>();
        mParts = new HashMap<>();
        IBuilder builder = new MersBuilder();
        constructCar(builder, colour, typeEngine,  typeTransmission, typeSteeringGearl, typeWheel);
    }
}
