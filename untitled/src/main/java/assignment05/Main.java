package assignment05;

public class Main {
    public static void main(String[] args) {
        // Haetaan Logger-instanssi
        Logger logger = Logger.getInstance();

        // Vaihdetaan tiedostonimi
        logger.setFileName("new_log.txt");

        // Kirjoitetaan lokiviestejä
        logger.write("Simulaatio käynnistetty");
        logger.write("Käsitellään dataa...");
        logger.write("Simulaatio päättyi");

        // Suljetaan logger kun ei enää tarvita
        logger.close();
    }
}
