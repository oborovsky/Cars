/**
 * Created by ulihtenshtein on 02.12.15.
 */
public interface IBuilder {
    IWheel buildWheel(ICar.TypeWheel typeWheel);
    ISteeringGearl buildSteeringGearl(ICar.TypeSteeringGearl typeSteeringGearl);
    IEngine buildEngine(ICar.TypeEngine typeEngine);
    IBody buildBody(ICar.Colour colour);
    ITransmission buidTransmission(ICar.TypeTransmission typeTransmission);
    ISpoiler buildSpoiler(ICar.Colour colour);
}
