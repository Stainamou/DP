package prototype;

import java.util.*;

public class Main {
    private static final List<Recommendation> recommendations = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Create new recommendation");
            System.out.println("2. View recommendations");
            System.out.println("3. Clone and modify recommendation");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1": createRecommendation(); break;
                case "2": viewRecommendations(); break;
                case "3": cloneAndModifyRecommendation(); break;
                case "4": return;
                default:
                    System.out.println("Invalid option");
            }
        }
    }

    private static void createRecommendation() {
        System.out.println("Enter target audience");
        String audience = scanner.nextLine();
        List<Book> books = inputBooks();
        recommendations.add(new Recommendation(audience, books));
        System.out.println("Recommendation created");
    }

    private static void viewRecommendations() {
        if (recommendations.isEmpty()) {
            System.out.println("No recommendations available");
            return;
        }
        for (int i = 0; i < recommendations.size(); i++) {
            Recommendation rec = recommendations.get(i);
            System.out.println("\n[" + i + "] Audience: " + rec.targetAudience);
            for (int j = 0; j < rec.books.size(); j++) {
                Book b = rec.books.get(j);
                System.out.println("  (" + j + ") " + b.title + " by " + b.author + " [" + b.genre + ", " + b.publicationYear + "]");
            }
        }
    }

    private static void cloneAndModifyRecommendation() {
        viewRecommendations();
        if (recommendations.isEmpty()) return;
        System.out.println("Enter index to clone: ");
        int index = Integer.parseInt(scanner.nextLine());
        if (index < 0 || index >= recommendations.size()) {
            System.out.println("Invalid index");
            return;
        }
        Recommendation cloned = recommendations.get(index).clone();
        System.out.println("Change target audience? (y/n): ");
        if (scanner.nextLine().equalsIgnoreCase("y")) {
            System.out.println("Enter new target audience: ");
            cloned.setTargetAudience(scanner.nextLine());
        }
        while (true) {
            System.out.println("Modify books: 1) Add 2) Remove 3) Done");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                Book b = inputBook();
                if (b != null) cloned.addBook(b);
            } else if (choice.equals("2")) {
                for (int i = 0; i < cloned.books.size(); i++) {
                    Book b = cloned.books.get(i);
                    System.out.println("  (" + i + ") " + b.title + " by " + b.author + " [" + b.genre + ", " + b.publicationYear + "]");
                }
                System.out.println("Enter index to remove: ");
                int removeIndex = Integer.parseInt(scanner.nextLine());
                cloned.removeBook(removeIndex);
            } else if (choice.equals("3")) {
                break;
            }
        }
        recommendations.add(cloned);
        System.out.println("Cloned and modified recommendation saved");
    }

    private static List<Book> inputBooks() {
        List<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("Add a book (title, author, genre, year) or type 'done': ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) break;
            String[] parts = input.split("\\s*,\\s*");
            if (parts.length == 4) {
                try {
                    books.add(new Book(parts[0], parts[1], parts[2], Integer.parseInt(parts[3])));
                } catch (NumberFormatException e) {
                    System.out.println("Year must be a number");
                }
            } else {
                System.out.println("Please enter in 'title, author, genre. year' format");
            }
        }
        return books;
    }

    private static Book inputBook() {
        System.out.println("Enter book (title, author, genre, year): ");
        String input = scanner.nextLine();
        String[] parts = input.split("\\s*,\\s*");
        if (parts.length == 4) {
            try {
                return new Book(parts[0], parts[1], parts[2], Integer.parseInt(parts[3]));
            } catch (NumberFormatException e) {
                System.out.println("Year must be a number");
            }
        } else {
            System.out.println("Please enter in 'title, author, genre, year' format");
        }
        return null;
    }
}
