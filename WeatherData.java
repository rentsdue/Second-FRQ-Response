import java.util.ArrayList;

public class WeatherData {

    private ArrayList<Double> temperatures;

    public WeatherData(ArrayList<Double> temperatures) {
        this.temperatures=temperatures;
    }

/**
* Cleans the data by removing from temperatures all values that are less than
* lower and all values that are greater than upper, as described in part (a)
*/
    public void cleanData(double lower, double upper) { 
        for (int i=0; i<temperatures.size(); i++) {
            if (temperatures.get(i)<lower || temperatures.get(i)>upper) {
                temperatures.remove(i);
                i--;
            }
        }
    }

/**
* Returns the length of the longest heat wave found in temperatures, as described in part (b)
* Precondition: There is at least one heat wave in temperatures based on threshold.
*/

    public int longestHeatWave(double threshold) { 
        double max= temperatures.get(0);
        for (int i=0; i < temperatures.size(); i++) {
            if (temperatures.get(i) > max || temperatures.get(i) < threshold) {
                return i;
            }
        }
        return -1; 
    }

}