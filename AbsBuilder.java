/**
 * Created by ulihtenshtein on 02.12.15.
 */
public abstract class AbsBuilder implements IBuilder {
    protected   AbsCarFactory mCarFactory;
    protected ICar mCar;
    @Override
    public void buildWheel(final ICar.Position position, final ICar.TypeWheel typeWheel)
    {
        IWheel wheel = (IWheel)mCarFactory.make(typeWheel.name());
        if( wheel == null) throw new IllegalArgumentException("didn't make this product:" + typeWheel.name());
        mCar.setWheel(position, wheel);
    }


    @Override
    public void buildSteeringGearl(final ICar.TypeSteeringGearl typeSteeringGearl)
    {
        IProduct steeringGearl = mCarFactory.make(typeSteeringGearl.name());
        if( steeringGearl == null) throw new IllegalArgumentException("didn't make this product:"+ typeSteeringGearl.name());
        mCar.setPart("SteeringGearl", steeringGearl);
    }

    @Override
    public void buildEngine(final ICar.TypeEngine typeEngine)
    {
        IProduct engine = mCarFactory.make(typeEngine.name());
        if( engine == null) throw new IllegalArgumentException("didn't make this product:"+ typeEngine.name());
        mCar.setPart("Engine", engine);
    }

    @Override
    public void buildBody(final ICar.Colour colour)
    {
        IProduct body = mCarFactory.make("BODY");
        if (body == null) throw new IllegalArgumentException("didn't make this product: BODY");
        ((IBody)body).setColour(colour);
        mCar.setPart("Body", body);
    }

    @Override
    public void buidTransmission(final ICar.TypeTransmission typeTransmission)
    {
        IProduct transmission = mCarFactory.make(typeTransmission.name());
        if( transmission == null) throw new IllegalArgumentException("didn't make this product:"+ typeTransmission.name());
        mCar.setPart("Transmission", transmission);
    }

    @Override
    public void buildSpoiler(final ICar.Colour colour)

    {
        IProduct spoiler = mCarFactory.make("SPOILER");
        if (spoiler == null) throw new IllegalArgumentException("didn't make this product: SPOILER");
        ((ISpoiler)spoiler).setColour(colour);
        mCar.setPart("Spoiler", spoiler);
    }

    @Override
    public ICar getCar()
    {
        return mCar;
    }
}
