package observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData {

    private List<Display> displayList = new ArrayList<>();

    public void registerDisplay(Display display) {
        displayList.add(display);
    }

    public void removeDisplay(Display display) {
        displayList.remove(display);
    }

    public float getTemperature() {
        return 0;
    }

    public float getHumidity(){
        return 0;
    }

    public float getPressure() {
        return 0;
    }

    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        displayList.forEach(display -> display.update(temp, humidity, pressure));
    }
}
