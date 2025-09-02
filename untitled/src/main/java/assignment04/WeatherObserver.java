// Tämä on havaitsijan rajapinta (interface)
// Jokainen havaitsija toteuttaa tämän ja reagoi lämpötilamuutoksiin
public interface WeatherObserver {
    void update(int temperature); // Metodi, jota kutsutaan kun lämpötila muuttuu
}