package factory_method;

public class Game {
    public static void main(String[] args) {
        Map cityMap = new CityMap(5, 10);
        cityMap.display();
        System.out.println();

        Map wildernessMap = new WildernessMap(5, 10);
        wildernessMap.display();
        System.out.println();
    }
}
