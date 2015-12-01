/**
 * Created by ulihtenshtein on 02.12.15.
 */
public interface ICar {
    enum TypeEngine {ENGINE_V1_6L, ENGINE_V2_4L, ENGINE_V3_2L}
    enum TypeSteeringGearl {STEERING_GEARL_HYDRO, STEERING_GEARL_NONEHYDRO}
    enum TypeWheel {WHEEL_D17, WHEEL_D19, WHEEL_D22}
    enum Colour {BLUE, WHITE, BLACK, YELLOW, GREY, GOLD}
    enum TypeTransmission {TRANSMISSION_AUTO, TRANSMISSION_MECH}
    enum Position {FRONT_LEFT, FRONT_RIGHT, BACK_LEFT, BACK_RIGHT}
    String getName();
    void setPart(String partName, IProduct aPart);
    void setWheel(Position position, IWheel wheel);
}
