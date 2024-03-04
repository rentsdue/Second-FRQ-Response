import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> p = new ArrayList<>();
        p.add(99.1);
        p.add(142.0);
        p.add(85.0);
        p.add( 85.1);
        p.add(84.6);
        p.add(94.3);
        p.add(124.9);
        p.add(98.0);
        p.add(101.5);
        p.add(102.5);

        WeatherData d= new WeatherData(p);
        d.cleanData(85.0, 120.0);
        for (double num: p) {
            System.out.println(num);
        }
    }
}