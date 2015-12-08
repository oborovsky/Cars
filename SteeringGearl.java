
public class SteeringGearl implements ISteeringGearl, IProduct {
    private ICar.TypeSteeringGearl mTypeSteeringGearl;
    public SteeringGearl(ICar.TypeSteeringGearl typeSteeringGearl)
    {
        mTypeSteeringGearl = typeSteeringGearl;
    }
    @Override
    public ICar.TypeSteeringGearl getType()
    {
        return mTypeSteeringGearl;
    }

    @Override
    public IProduct clone()
    {
        return new SteeringGearl(mTypeSteeringGearl);

    }

    @Override
    public String toString()
    {
        return "SteeringGearl{" + mTypeSteeringGearl + "}\n";
    }
}
