// Tämä on pääohjelma, jossa luodaan säähavaintoasema ja havaitsijat
public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        // Luodaan havaitsijoita
        WeatherObserver observer1 = new WeatherObserver() {
            public void update(int temperature) {
                System.out.println("Observer 1: Lämpötila on nyt " + temperature + "°C");
            }
        };

        WeatherObserver observer2 = new WeatherObserver() {
            public void update(int temperature) {
                System.out.println("Observer 2: Havaittu lämpötila: " + temperature + "°C");
            }
        };

        // Rekisteröidään havaitsijat
        station.addObserver(observer1);
        station.addObserver(observer2);

        // Käynnistetään säähavaintoasema omassa säikeessään
        station.start();

        // Annetaan simulaation pyöriä hetken
        try {
            Thread.sleep(15000); // 15 sekuntia
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Poistetaan toinen havaitsija
        System.out.println("Poistetaan Observer 1...");
        station.removeObserver(observer1);

        // Annetaan simulaation jatkua
        try {
            Thread.sleep(10000); // 10 sekuntia
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Lopetetaan ohjelma (säie jatkaa ikuisesti, ellei keskeytetä)
        System.out.println("Simulaatio päättyy (sulje ohjelma manuaalisesti)");
    }
}
