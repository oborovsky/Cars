import java.util.HashMap;

/**
 * Created by ulihtenshtein on 02.12.15.
 */
public class MersCarFactory extends AbsCarFactory {
    public MersCarFactory()
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

    }
}
