package Theory_lessons_15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Playlist playlist = new Playlist();

        // стартовые песни
        playlist.addSong(new Song("Believer", "Imagine Dragons", 204));
        playlist.addSong(new Song("Lose Yourself", "Eminem", 326));
        playlist.addSong(new Song("Shape of You", "Ed Sheeran", 233));
        playlist.addSong(new Song("Numb", "Linkin Park", 187));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1) Print playlist");
            System.out.println("2) Add song");
            System.out.println("3) Remove song by title");
            System.out.println("4) Move song to top by title");
            System.out.println("0) Exit");
            System.out.print("Choose: ");

            String choice = scanner.nextLine().trim();

            if (choice.equals("0")) {
                System.out.println("Bye!");
                break;
            }

            switch (choice) {
                case "1":
                    playlist.print();
                    break;

                case "2":
                    System.out.print("Title: ");
                    String title = scanner.nextLine();

                    System.out.print("Artist: ");
                    String artist = scanner.nextLine();

                    System.out.print("Duration (seconds): ");
                    int duration = readInt(scanner);

                    playlist.addSong(new Song(title, artist, duration));
                    System.out.println("Added.");
                    break;

                case "3":
                    System.out.print("Enter title to remove: ");
                    String removeTitle = scanner.nextLine();

                    if (playlist.removeByTitle(removeTitle)) {
                        System.out.println("Removed.");
                    } else {
                        System.out.println("Mahnı tapılmadı");
                    }
                    break;

                case "4":
                    System.out.print("Enter title to move to top: ");
                    String moveTitle = scanner.nextLine();

                    if (playlist.moveToTop(moveTitle)) {
                        System.out.println("Moved to top.");
                    } else {
                        System.out.println("Mahnı tapılmadı");
                    }
                    break;

                default:
                    System.out.println("Unknown command!");
            }
        }

        scanner.close();
    }

    private static int readInt(Scanner scanner) {
        while (true) {
            String text = scanner.nextLine().trim();
            try {
                int value = Integer.parseInt(text);
                if (value <= 0) {
                    System.out.print("Duration must be > 0. Try again: ");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.print("Please enter a valid number: ");
            }
        }
    }
}
