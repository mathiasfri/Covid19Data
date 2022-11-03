import java.util.Comparator;

public class AgeComparator implements Comparator<CovidData>
{
    public int compare(CovidData cd1, CovidData cd2)
    {
        return cd1.getAge().compareTo(cd2.getAge());
    }
}
