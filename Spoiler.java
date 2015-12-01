/**
 * Created by ulihtenshtein on 02.12.15.
 */
public class Spoiler implements ISpoiler, IProduct {
    private ICar.Colour mColour;

    public Spoiler(final ICar.Colour colour)
    {
        mColour = colour;
    }
    public Spoiler()
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
        return new Spoiler(mColour);
    }

    @Override
    public String toString()
    {
        return "Spoiler{" +
                "mColour=" + mColour +
                "}\n";
    }
}
