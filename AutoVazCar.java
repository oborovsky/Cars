import java.util.HashMap;

/**
 * Created by ulihtenshtein on 02.12.15.
 */
public class AutoVazCar extends AbsCar {
    public AutoVazCar(ICar.Colour colour, ICar.TypeEngine typeEngine, ICar.TypeTransmission typeTransmission, ICar.TypeSteeringGearl typeSteeringGearl, ICar.TypeWheel typeWheel)
    {
        mName = "Vaz";
        mWheels = new HashMap<>();
        mParts = new HashMap<>();
        IBuilder builder = new AutoVazBuilder();
        constructCar(builder, colour, typeEngine,  typeTransmission, typeSteeringGearl, typeWheel);
    }
}
