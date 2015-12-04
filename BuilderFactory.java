/**
 * Created by ulihtenshtein on 05.12.15.
 */
public  class BuilderFactory {
    private static IBuilder mMersBuilder = null;
    private static IBuilder mVazBuilder = null;

    public static IBuilder getMersBuilder()
    {
        if (mMersBuilder == null) mMersBuilder = new MersBuilder();
        return  mMersBuilder;
    }
    public static IBuilder getVazBuilder()
    {
        if (mVazBuilder == null) mVazBuilder = new AutoVazBuilder();
        return mVazBuilder;
    }
}
