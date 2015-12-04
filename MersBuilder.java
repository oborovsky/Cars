/**
 * Created by ulihtenshtein on 02.12.15.
 */
public class MersBuilder extends AbsBuilder {

    public MersBuilder()
    {
        mCarFactory = new MersCarFactory();
        mCar = new MersCar();
    }

}
