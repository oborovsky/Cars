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

