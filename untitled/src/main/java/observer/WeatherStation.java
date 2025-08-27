package observer;

import java.util.ArrayList;
import java.util.List;
import observer.WeatherObserver;

public abstract class WeatherStation extends Thread{
    private List<WeatherObserver> weatherObservers = new ArrayList<>();

    @Override
    public void run() {

    }

    public void addObserver(WeatherObserver observer) {
        weatherObservers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        weatherObservers.remove(observer);
    }

    public void notifyObservers(int temperature) {
        for (WeatherObserver observer : weatherObservers) {
            observer.updateTemperature(temperature);
        }
    }
}
