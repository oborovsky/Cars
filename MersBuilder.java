import java.util.HashMap;
import java.util.Random;

public class MersBuilder extends AbsBuilder {
    @Override
    public ICar getCar()
    {
        return ((MersCar)mCar).clone();
    }

    protected class MersCar extends AbsCar {
        protected MersCar()
        {
            mName = "Mersedes-Benz";
            mWheels = new HashMap<>();
            mParts = new HashMap<>();
        }
        protected MersCar clone()
        {
            MersCar car = new MersCar();
            copy(car);
            return car;

        }
    }
    public MersBuilder()
    {
        mPartCatalog = new HashMap<>();

        ICar.TypeWheel[] wheels = ICar.TypeWheel.values();
        for( int i = 0; i < wheels.length; i++)
        {
            IWheel wheel = new Wheel(wheels[i]);
            addPart(wheel.getType().name(), (IProduct)wheel);
        }

        ICar.TypeSteeringGearl[] steeringGearls = ICar.TypeSteeringGearl.values();
        for( int i = 0; i < steeringGearls.length; i++)
        {
            ISteeringGearl steeringGearl = new SteeringGearl(steeringGearls[i]);
            addPart(steeringGearl.getType().name(), (IProduct)steeringGearl);
        }
        IEngine engineV2_4L = new Engine(ICar.TypeEngine.ENGINE_V2_4L);
        IEngine engineV3_2L = new Engine(ICar.TypeEngine.ENGINE_V3_2L);
        addPart(engineV3_2L.getType().name(), (IProduct) engineV3_2L);
        addPart(engineV2_4L.getType().name(), (IProduct) engineV2_4L);


        IBody body = new Body();
        addPart("BODY",(IProduct)body);

        ITransmission transmissionAuto = new Transmission(ICar.TypeTransmission.TRANSMISSION_AUTO);
        addPart(transmissionAuto.getType().name(), (IProduct) transmissionAuto);

        ISpoiler spoiler = new Spoiler();
        addPart("SPOILER", (IProduct)spoiler);

        mCar = new MersCar();
    }

}
