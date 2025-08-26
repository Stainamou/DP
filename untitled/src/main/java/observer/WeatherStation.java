package observer;

import java.util.ArrayList;
import java.util.List;
import observer.WeatherObserver;

public abstract class WeatherStation {
    private List<WeatherObserver> weatherObservers = new ArrayList<>();

    public void addObserver(WeatherObserver observer) {
        weatherObservers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        weatherObservers.remove(observer);
    }

    public void notifyObservers() {
    }
}
