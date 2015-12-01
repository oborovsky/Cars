/**
 * Created by ulihtenshtein on 02.12.15.
 */
public class Engine implements IProduct, IEngine {
    private ICar.TypeEngine mTypeEngine;
    Engine(ICar.TypeEngine typeEngine)
    {
        mTypeEngine = typeEngine;
    }
    @Override
    public IProduct clone()
    {
        return new Engine(mTypeEngine);
    }

    @Override
    public ICar.TypeEngine getType()
    {
        return mTypeEngine;
    }

    @Override
    public String toString()
    {
        return "Engine{" +
                "mTypeEngine=" + mTypeEngine +
                "}\n";
    }
}
