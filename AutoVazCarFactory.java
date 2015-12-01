import java.util.HashMap;

/**
 * Created by ulihtenshtein on 02.12.15.
 */
public class AutoVazCarFactory extends AbsCarFactory {
    public AutoVazCarFactory()
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
        IEngine engineV1_6L = new Engine(ICar.TypeEngine.ENGINE_V1_6L);
        addPart(engineV1_6L.getType().name(), (IProduct) engineV1_6L);
        addPart(engineV2_4L.getType().name(), (IProduct) engineV2_4L);


        IBody body = new Body();
        addPart("BODY",(IProduct)body);

        ITransmission transmissionMech = new Transmission(ICar.TypeTransmission.TRANSMISSION_MECH);
        addPart(transmissionMech.getType().name(), (IProduct) transmissionMech);

        ISpoiler spoiler = new Spoiler();
        addPart("SPOILER", (IProduct)spoiler);

    }
}
