import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        FileHandler fileHandler = new FileHandler();
        Scanner sc = new Scanner(System.in);

        System.out.println("I dette program kan du se data over Covid-19 delt over Danmark");
        System.out.println("""
                1. Vis alt data usorteret
                2. Vis data sorteret efter regioner
                3. Vis data efter alder
                4. Afslut
                
                """);

        boolean askedExit = false;

        while (!askedExit)
        {
            int userChoice = sc.nextInt();

            switch (userChoice)
            {
                case 1:
                    for (CovidData cd : fileHandler.handleData())
                    {
                        System.out.println(cd);
                    }
                    break;

                case 2:
                    Collections.sort(fileHandler.handleData(), new RegionComparator());

                    for (CovidData cd : fileHandler.handleData())
                    {
                        System.out.println(cd);
                    }
                    break;

                case 3:
                    Collections.sort(fileHandler.handleData(), new AgeComparator());
                    for (CovidData cd : fileHandler.handleData())
                    {
                        System.out.println(cd);
                    }
                    break;

                case 4:
                    askedExit = true;
                    System.out.println("Farvel");
                    System.exit(0);
            }
        }
    }
}
