package advisor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        print(str, scanner, false);
    }

    public static void print(String str, Scanner scanner, boolean authStatus) {
        if (str.equals("auth")) {
            authStatus = true;
            System.out.println("https://accounts.spotify.com/authorize?client_id=7445592451214ca29a55a48e1644a768&redirect_uri=http://localhost:8080&response_type=code");
            System.out.println("---SUCCESS---");
        }
        if (authStatus) {
            switch (str) {
                case "new" : printNews(); break;
                case "featured" : printFeatured(); break;
                case "categories" : printCategories(); break;
                case "playlists Mood" : printPlaylists(); break;
                case "exit" : sayBye(); break;
            }
        } else {
            System.out.println("Please, provide access for application.");
        }
        if (scanner.hasNextLine()) {
            str = scanner.nextLine();
            print(str, scanner, authStatus);
        }
        return;
    }

    public static void sayBye() {
        System.out.println("---GOODBYE!---");
    }

    public static void printNews() {
        System.out.println("---NEW RELEASES---");
        System.out.println("Mountains [Sia, Diplo, Labrinth]");
        System.out.println("Runaway [Lil Peep]");
        System.out.println("The Greatest Show [Panic! At The Disco]");
        System.out.println("All Out Life [Slipknot]");
    }

    public static void printFeatured() {
        System.out.println("---FEATURED---");
        System.out.println("Mellow Morning");
        System.out.println("Wake Up and Smell the Coffee");
        System.out.println("Monday Motivation");
        System.out.println("Songs to Sing in the Shower");
    }

    public static void printCategories() {
        System.out.println("---CATEGORIES---");
        System.out.println("Top Lists");
        System.out.println("Pop");
        System.out.println("Mood");
        System.out.println("Latin");
    }

    public static void printPlaylists() {
        System.out.println("---MOOD PLAYLISTS---");
        System.out.println("Walk Like A Badass");
        System.out.println("Rage Beats");
        System.out.println("Arab Mood Booster");
        System.out.println("Sunday Stroll");
    }
}
