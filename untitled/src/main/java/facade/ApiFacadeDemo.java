package facade;

public class ApiFacadeDemo {
    public static void main(String[] args) {
        ApiFacade apiFacade = new ApiFacade();

        try {
            String joke = apiFacade.getAttributeValueFromJson("https://api.chucknorris.io/jokes/random", "value");
            System.out.println("Chuck Norris joke: " + joke);

            String baseCurrency = apiFacade.getAttributeValueFromJson("https://api.fxratesapi.com/latest", "base");
            System.out.println("Base currency: " + baseCurrency);
        } catch (IllegalArgumentException | java.io.IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
