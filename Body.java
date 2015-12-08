
public class Body implements IBody, IProduct {
    private ICar.Colour mColour;

    public Body(final ICar.Colour colour)
    {
        mColour = colour;
    }
    public Body()
    {
        mColour = ICar.Colour.YELLOW;
    }

    @Override
    public ICar.Colour getColour()
    {
        return mColour;
    }

    @Override
    public void setColour(final ICar.Colour colour)
    {
        mColour = colour;
    }

    @Override
    public IProduct clone()
    {
        return new Body(mColour);
    }

    @Override
    public String toString()
    {
        return "Body{" + mColour + "}\n";
    }
}
