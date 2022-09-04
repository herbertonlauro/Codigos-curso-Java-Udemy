package vetores;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Room[] rooms = new Room[10];


        System.out.print("How many rooms will be rented? ");
        int roomsToBeRented = scanner.nextInt();

        for(int i = 0; i < roomsToBeRented; i++) {
            System.out.println("Rent #" + (i + 1));

            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Room: ");
            int room = scanner.nextInt();

            if(rooms[room - 1] != null) {
                while (rooms[room -1] != null) {
                    System.out.print("Este quarto já está ocupado, escolha outro: ");
                    room = scanner.nextInt();
                }
            }

            Room createdRoom = new Room(name, email, room);

            rooms[room-1] = createdRoom;
        }

        System.out.println("Busy rooms:");
        for(int i = 0; i < rooms.length; i++) {
            if(rooms[i] != null) {
                System.out.printf("%d: %s, %s\n", rooms[i].getRoom(), rooms[i].getName(), rooms[i].getEmail());
            }
        }
    }
}
