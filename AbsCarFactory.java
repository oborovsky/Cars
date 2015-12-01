import java.util.Map;

public abstract class AbsCarFactory {
    protected Map<String, IProduct> mPartCatalog;
    public IProduct make(String partName)
    {
        IProduct product = mPartCatalog.get(partName);
        if ( product != null ) return product.clone();
        return null;
    }
    public void addPart(String partName, IProduct aPrototype)
    {
        mPartCatalog.put(partName, aPrototype);
    }
}
