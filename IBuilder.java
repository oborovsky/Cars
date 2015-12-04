/**
 * Created by ulihtenshtein on 02.12.15.
 */
public interface IBuilder {
    void buildWheel(ICar.Position position, ICar.TypeWheel typeWheel);
    void buildSteeringGearl(ICar.TypeSteeringGearl typeSteeringGearl);
    void buildEngine(ICar.TypeEngine typeEngine);
    void buildBody(ICar.Colour colour);
    void buidTransmission(ICar.TypeTransmission typeTransmission);
    void buildSpoiler(ICar.Colour colour);
    ICar getCar();
}
