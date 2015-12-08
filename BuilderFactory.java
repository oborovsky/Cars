
public  class BuilderFactory {
    private BuilderFactory(){};
    static BuilderFactory mBuilderFactory = null;
    public static BuilderFactory getInstance()
    {
        if (mBuilderFactory == null) mBuilderFactory = new BuilderFactory();
        return mBuilderFactory;
    }
    public IBuilder getMersBuilder()
    {
        return  new MersBuilder();
    }
    public IBuilder getVazBuilder()
    {
        return new AutoVazBuilder();
    }
}
