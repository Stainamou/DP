import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

// Tämä luokka on säähavaintoasema
// Se pyörii omassa säikeessään ja ilmoittaa havaitsijoille lämpötilamuutoksista
public class WeatherStation extends Thread {
    private List<WeatherObserver> observers = new ArrayList<>();
    private int temperature;
    private final int MIN_TEMP = -10;
    private final int MAX_TEMP = 35;

    // Konstruktori: asetetaan satunnainen aloituslämpötila
    public WeatherStation() {
        temperature = ThreadLocalRandom.current().nextInt(MIN_TEMP, MAX_TEMP + 1);
    }

    // Rekisteröi havaitsija
    public void addObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    // Poistaa havaitsijan
    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    // Ilmoittaa kaikille havaitsijoille uudesta lämpötilasta
    private void notifyObservers() {
        for (WeatherObserver observer : observers) {
            observer.update(temperature);
        }
    }

    // Säie alkaa tästä metodista
    public void run() {
        while (true) {
            try {
                // Odotetaan satunnainen aika (1–5 sekuntia)
                int sleepTime = ThreadLocalRandom.current().nextInt(1000, 5001);
                Thread.sleep(sleepTime);

                // Muutetaan lämpötilaa satunnaisesti yhdellä asteella
                int change = ThreadLocalRandom.current().nextInt(-1, 2); // -1, 0 tai +1
                temperature += change;

                // Varmistetaan että lämpötila pysyy sallituissa rajoissa
                if (temperature < MIN_TEMP) temperature = MIN_TEMP;
                if (temperature > MAX_TEMP) temperature = MAX_TEMP;

                // Ilmoitetaan havaitsijoille
                notifyObservers();

            } catch (InterruptedException e) {
                System.out.println("Säie keskeytettiin");
                break;
            }
        }
    }
}
