/**
 * Created by ulihtenshtein on 02.12.15.
 */
public class Wheel implements IWheel, IProduct {
    private ICar.TypeWheel mTypeWheel;

    public Wheel(final ICar.TypeWheel typeWheel)
    {
        mTypeWheel = typeWheel;
    }

    @Override
    public ICar.TypeWheel getType()
    {
        return mTypeWheel;
    }

    @Override
    public IProduct clone()
    {
        return new Wheel(mTypeWheel);
    }

    @Override
    public String toString()
    {
        return "Wheel{" +
                "mTypeWheel=" + mTypeWheel +
                "}\n";
    }
}
