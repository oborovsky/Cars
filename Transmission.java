
public class Transmission implements ITransmission, IProduct {
    private ICar.TypeTransmission mTypeTransmission;

    public Transmission(final ICar.TypeTransmission typeTransmission)
    {
        mTypeTransmission = typeTransmission;
    }

    @Override
    public ICar.TypeTransmission getType()
    {
        return mTypeTransmission;
    }

    @Override
    public IProduct clone()
    {
        return new Transmission(mTypeTransmission);
    }

    @Override
    public String toString()
    {
        return "Transmission{" + mTypeTransmission + "}\n";
    }
}
