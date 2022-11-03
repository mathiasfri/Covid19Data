public class CovidData
{
    String region;
    String age;
    int confirmed;
    int dead;
    int intensiveHospitalized;
    int hospitalized;
    String date;

    public CovidData(String region, String age, int confirmed, int dead, int intensiveHospitalized, int hospitalized, String date)
    {
        this.region = region;
        this.age = age;
        this.confirmed = confirmed;
        this.dead = dead;
        this.intensiveHospitalized = intensiveHospitalized;
        this.hospitalized = hospitalized;
        this.date = date;
    }

    @Override
    public String toString()
    {
        return
                "Region: " + region + "  " +
                "Age: " + age + "  " +
                "Confirmed: " + confirmed + "  " +
                "Dead: " + dead + "  " +
                "Intensive-Hospitalized: " + intensiveHospitalized + "  " +
                "Hospitalized: " + hospitalized + "  " +
                "Date: " + date;
    }
}
