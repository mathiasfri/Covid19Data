import java.util.Comparator;

public class RegionComparator implements Comparator<CovidData>
{
    public int compare(CovidData cd1, CovidData cd2)
    {
        return cd1.getRegion().compareTo(cd2.getRegion());
    }
}
