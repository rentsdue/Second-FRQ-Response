import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Testing the first FRQ question 1
        ArrayList<Double> p = new ArrayList<>();
        p.add(99.1);
        p.add(142.0);
        p.add(85.0);
        p.add(85.1);
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

        //FRQ 1 question 2:
        ArrayList<Double> list= new ArrayList<>();
        list.add(100.5);
        list.add(98.5);
        list.add(102.0);
        list.add(103.9);
        list.add(87.5);
        list.add(105.2);
        list.add(90.3);
        list.add(94.8);
        list.add(109.1);
        list.add(102.1);
        list.add(107.4);
        list.add(93.2);
        WeatherData wData= new WeatherData(list);
        int length1= wData.longestHeatWave(100.5);
        int length2= wData.longestHeatWave(95.2);
        System.out.println(length1 + " " + length2);

        //Testing FRQ 2 Q2:
        LightBoard sim= new LightBoard(7, 5);
        boolean[][] array= {{true, true, false, true, true}, {true, false, false, true, false}, {true, false, false, true, true}, {true, false, false, false, true}, {true, false, false, false, true}, {true, true, false, true, true}, {false, false, false, false, false}};
        sim.setLights(array);
        boolean bool1= sim.evaluateLight(0, 3);
        boolean bool2= sim.evaluateLight(6, 0); 
        boolean bool3= sim.evaluateLight(4, 1); 
        boolean bool4= sim.evaluateLight(5, 4);
        System.out.println(bool1 + " " + bool2 + " " + bool3 + " " + bool4);
    }
}