package state;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Character character = new Character("Hero");

        while (!(character.getLevelName().equals("Master"))) {
            System.out.println("\nStatus: Name: " + character.getName() +
                    ", Level: " + character.getLevelName() +
                    ", XP: " + character.getXp() +
                    ", HP: " + character.getHp());
            System.out.println("Available actions:");
            switch (character.getLevelName()) {
                case "Novice":
                    System.out.println("1. Train (+10 XP)");
                    System.out.println("2. Meditate (+2 HP)");
                    break;
                case "Intermediate":
                    System.out.println("1. Train (+7 XP)");
                    System.out.println("2. Meditate (+5 HP)");
                    break;
                case "Expert":
                    System.out.println("1. Train (+5 XP)");
                    System.out.println("2. Meditate (+10 HP)");
                    System.out.println("3. Fight (-10 HP, +15 XP)");
                    break;
            }
            System.out.println("Choose an action: ");
            int choice = sc.nextInt();

            switch (character.getLevelName()) {
                case "Novice":
                    if (choice == 1) character.train();
                    break;
                case "Intermediate":
                    if (choice == 1) character.train();
                    else if (choice == 2) character.meditate();
                    break;
                case "Expert":
                    if (choice == 1) character.train();
                    else if (choice == 2) character.meditate();
                    else if (choice == 3) character.fight();
                    break;
            }
        }
        System.out.println("Congatulations! " + character.getName() + " has reached Master level! Game over.");
    }
}
