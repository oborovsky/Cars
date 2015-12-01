import java.util.Map;

/**
 * Created by ulihtenshtein on 02.12.15.
 */
public abstract class AbsCar implements ICar {
    protected String mName;
    protected Map<Position, IWheel> mWheels;
    protected Map<String, IProduct> mParts;

    @Override
    public String getName()
    {
        return mName;
    }

    @Override
    public void setPart(final String partName, final IProduct aPart)
    {
        mParts.put(partName, aPart);
    }

    @Override
    public void setWheel(final Position position, final IWheel wheel)
    {
        mWheels.put(position, wheel);
    }

    protected void constructCar(IBuilder builder, ICar.Colour colour, ICar.TypeEngine tyeEngine, ICar.TypeTransmission typeTransmission, ICar.TypeSteeringGearl typeSteeringGearl, ICar.TypeWheel typeWheel)
    {
        IWheel wheel = builder.buildWheel(typeWheel);
        setWheel(Position.FRONT_LEFT, wheel);
        setWheel(Position.FRONT_RIGHT, wheel);
        setWheel(Position.BACK_LEFT, wheel);
        setWheel(Position.BACK_RIGHT, wheel);
        IBody body = builder.buildBody(colour);
        setPart("Body", (IProduct) body);
        ISteeringGearl steeringGearl = builder.buildSteeringGearl(typeSteeringGearl);
        setPart("SteeringGearl", (IProduct) steeringGearl);
        IEngine engine = builder.buildEngine(tyeEngine);
        setPart("Engine", (IProduct) engine);
        ITransmission transmission = builder.buidTransmission(typeTransmission);
        setPart("Transmission", (IProduct) transmission);
        ISpoiler spoiler = builder.buildSpoiler(colour);
        setPart("Spoiler", (IProduct) spoiler);

    }

    @Override
    public String toString()
    {
        return "Car{\n" +
                "mName='" + mName + '\n' +
                ", mWheels=" + mWheels +
                "\n, mParts=" + mParts +
                "\n}";
    }
}

