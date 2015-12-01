/**
 * Created by ulihtenshtein on 02.12.15.
 */
public abstract class AbsBuilder implements IBuilder {
    protected   AbsCarFactory mCarFactory;
    @Override
    public IWheel buildWheel(final ICar.TypeWheel typeWheel)
    {
        IWheel wheel = (IWheel)mCarFactory.make(typeWheel.name());
        if( wheel == null) throw new IllegalArgumentException("didn't make this product:" + typeWheel.name());
        return wheel;
    }

    @Override
    public ISteeringGearl buildSteeringGearl(final ICar.TypeSteeringGearl typeSteeringGearl)
    {
        ISteeringGearl steeringGearl = (ISteeringGearl)mCarFactory.make(typeSteeringGearl.name());
        if( steeringGearl == null) throw new IllegalArgumentException("didn't make this product:"+ typeSteeringGearl.name());
        return steeringGearl;
    }

    @Override
    public IEngine buildEngine(final ICar.TypeEngine typeEngine)
    {
        IEngine engine = (IEngine)mCarFactory.make(typeEngine.name());
        if( engine == null) throw new IllegalArgumentException("didn't make this product:"+ typeEngine.name());
        return engine;
    }

    @Override
    public IBody buildBody(final ICar.Colour colour)
    {
        IBody body = (IBody)mCarFactory.make("BODY");
        if (body == null) throw new IllegalArgumentException("didn't make this product: BODY");
        body.setColour(colour);
        return body;
    }

    @Override
    public ITransmission buidTransmission(final ICar.TypeTransmission typeTransmission)
    {
        ITransmission transmission = (ITransmission)mCarFactory.make(typeTransmission.name());
        if( transmission == null) throw new IllegalArgumentException("didn't make this product:"+ typeTransmission.name());
        return transmission;
    }

    @Override
    public ISpoiler buildSpoiler(final ICar.Colour colour)

    {
        ISpoiler spoiler = (ISpoiler)mCarFactory.make("SPOILER");
        if (spoiler == null) throw new IllegalArgumentException("didn't make this product: SPOILER");
        spoiler.setColour(colour);
        return spoiler;
    }
}
