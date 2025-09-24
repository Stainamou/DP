package adapter;

public class Main {
    public static void main(String[] args) {
        NewDateInterface date = new CalendarToNewDateAdapter();
        date.setYear(2024);
        date.setMonth(6);
        date.setDay(10);

        System.out.println("Initial date: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());

        date.advanceDays(5);
        System.out.println("After advancing 5 days: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());

        date.advanceDays(30);
        System.out.println("After advancing 30 days: " + date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
    }
}
