package addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookSystem {

    private Map<String, AddressBook> addressBooks = new HashMap<>();
    private Scanner sc = new Scanner(System.in);


    public void addNewAddressBook() {
        System.out.print("Enter New Address Book Name: ");
        String name = sc.nextLine();

        if (addressBooks.containsKey(name)) {
            System.out.println("Address Book '" + name + "' already exists!\n");
            return;
        }

        addressBooks.put(name, new AddressBook());
        System.out.println("Address Book '" + name + "' created successfully!\n");
    }


    public void openAddressBook() {
        System.out.print("Enter Address Book Name to Open: ");
        String name = sc.nextLine();

        AddressBook selected = addressBooks.get(name);

        if (selected == null) {
            System.out.println("No Address Book found with that name.\n");
            return;
        }

        System.out.println("\n--- Opening Address Book: " + name + " ---\n");
        selected.menu();
    }


    public void listAddressBooks() {
        if (addressBooks.isEmpty()) {
            System.out.println("No Address Books available.\n");
            return;
        }

        System.out.println("Available Address Books:");
        for (String name : addressBooks.keySet()) {
            System.out.println(" - " + name);
        }
        System.out.println();
    }


    public void mainMenu() {
        int choice;

        do {
            System.out.println("==== Address Book SYSTEM Menu ====");
            System.out.println("1. Create New Address Book");
            System.out.println("2. Open Existing Address Book");
            System.out.println("3. List All Address Books");
            System.out.println("4. Exit System");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addNewAddressBook();
                    break;

                case 2:
                    openAddressBook();
                    break;

                case 3:
                    listAddressBooks();
                    break;

                case 4:
                    System.out.println("Exiting System...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.\n");
            }

        } while (choice != 4);
    }

    public static void main(String[] args) {
        AddressBookSystem system = new AddressBookSystem();
        system.mainMenu();
    }
}
