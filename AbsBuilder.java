import java.util.Map;
import java.util.Random;

public abstract class AbsBuilder implements IBuilder {
    protected Map<String, IProduct> mPartCatalog;
    protected void addPart(String partName, IProduct aPrototype)
    {
        mPartCatalog.put(partName, aPrototype);
    }
    protected IProduct make(String partName)
    {
        IProduct product = mPartCatalog.get(partName);
        if ( product != null ) return product.clone();
        return null;
    }
    protected abstract class AbsCar implements ICar {
        protected String mName;
        protected  long mNumber;
        protected Map<Position, IWheel> mWheels;
        protected Map<String, IProduct> mParts;

        @Override
        public String getName()
        {
            return mName;
        }
        @Override
        public long getNumber()
        {
            return mNumber;
        }

        protected void setPart(final String partName, final IProduct aPart)
        {
            mParts.put(partName, aPart);
        }

        protected void setWheel(final Position position, final IWheel wheel)
        {
            mWheels.put(position, wheel);
        }
        protected void copy(AbsCar car)
        {
            car.mName = mName;
            car.mNumber = Math.abs(((new Random()).nextLong()));
            Object[] positions = mWheels.keySet().toArray();
            for ( int i = 0; i < positions.length; i++)
            {
                car.setWheel((ICar.Position)positions[i], (IWheel)(((IProduct) mWheels.get(positions[i])).clone()));
            }
            Object[] keys = mParts.keySet().toArray();
            for (int i = 0; i < keys.length; i++)
            {
                car.setPart((String)keys[i], mParts.get(keys[i]).clone());
            }

        }
        @Override
        public String toString()
        {
            return "Car{\n" +
                    "mNumber='" + mNumber + '\n' +
                    "mName='" + mName + '\n' +
                    ", mWheels=" + mWheels +
                    "\n, mParts=" + mParts +
                    "\n}";
        }
    }
    protected AbsCar mCar;
    @Override
    public void buildWheel(final ICar.Position position, final ICar.TypeWheel typeWheel)
    {
        IWheel wheel = (IWheel)make(typeWheel.name());
        if( wheel == null) throw new IllegalArgumentException("didn't make this product:" + typeWheel.name());
        mCar.setWheel(position, wheel);
    }


    @Override
    public void buildSteeringGearl(final ICar.TypeSteeringGearl typeSteeringGearl)
    {
        IProduct steeringGearl = make(typeSteeringGearl.name());
        if( steeringGearl == null) throw new IllegalArgumentException("didn't make this product:"+ typeSteeringGearl.name());
        mCar.setPart("SteeringGearl", steeringGearl);
    }

    @Override
    public void buildEngine(final ICar.TypeEngine typeEngine)
    {
        IProduct engine = make(typeEngine.name());
        if( engine == null) throw new IllegalArgumentException("didn't make this product:"+ typeEngine.name());
        mCar.setPart("Engine", engine);
    }

    @Override
    public void buildBody(final ICar.Colour colour)
    {
        IProduct body = make("BODY");
        if (body == null) throw new IllegalArgumentException("didn't make this product: BODY");
        ((IBody)body).setColour(colour);
        mCar.setPart("Body", body);
    }

    @Override
    public void buidTransmission(final ICar.TypeTransmission typeTransmission)
    {
        IProduct transmission = make(typeTransmission.name());
        if( transmission == null) throw new IllegalArgumentException("didn't make this product:"+ typeTransmission.name());
        mCar.setPart("Transmission", transmission);
    }

    @Override
    public void buildSpoiler(final ICar.Colour colour)

    {
        IProduct spoiler = make("SPOILER");
        if (spoiler == null) throw new IllegalArgumentException("didn't make this product: SPOILER");
        ((ISpoiler)spoiler).setColour(colour);
        mCar.setPart("Spoiler", spoiler);
    }

    @Override
    public ICar getCar()
    {
        return (ICar)mCar;
    }
}
