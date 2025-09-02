package assignment05;

import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    // Yksi ja ainoa instanssi Loggerista
    private static Logger instance = null;

    // Kirjoittaja tiedostoon
    private FileWriter writer;

    // Nykyinen tiedostonimi
    private String fileName = "default_log.txt";

    // Yksityinen konstruktori (vain yksi saa luotua)
    private Logger() {
        try {
            writer = new FileWriter(fileName, true); // true = lisää tiedostoon
        } catch (IOException e) {
            System.out.println("Virhe tiedoston avaamisessa: " + e.getMessage());
        }
    }

    // Julkinen metodi instanssin hakemiseen
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Vaihda tiedostonimi
    public void setFileName(String newFileName) {
        try {
            if (writer != null) {
                writer.close(); // sulje vanha tiedosto
            }
            fileName = newFileName;
            writer = new FileWriter(fileName, true); // avaa uusi tiedosto
        } catch (IOException e) {
            System.out.println("Virhe tiedoston vaihtamisessa: " + e.getMessage());
        }
    }

    // Kirjoita viesti tiedostoon ja näytä myös konsolissa
public void write(String message) {
    try {
        writer.write(message + "\n"); // kirjoitetaan tiedostoon
        writer.flush(); // varmistetaan että se menee heti
        System.out.println("LOG: " + message); // tulostetaan konsoliin
    } catch (IOException e) {
        System.out.println("Virhe kirjoitettaessa: " + e.getMessage());
    }
}

    // Sulje tiedosto kun ei enää tarvita
    public void close() {
        try {
            if (writer != null) {
                writer.close();
            }
        } catch (IOException e) {
            System.out.println("Virhe suljettaessa: " + e.getMessage());
        }
    }
}