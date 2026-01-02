package addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookSystem
{
    private Map<String, AddressBook> addressBooks = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    public void addNewAddressBook()
    {
        System.out.print("ENTER NEW ADDRESS BOOK NAME : ");
        String name = sc.nextLine();

        if (addressBooks.containsKey(name))
        {
            System.out.println("ADDRESS BOOK ALREADY EXISTS : ");
            return;
        }

        addressBooks.put(name, new AddressBook());
        System.out.println("ADDRESS BOOK CREATED SUCCESSFULLY : ");
    }

    public void openAddressBook()
    {
        System.out.print("ENTER ADDRESS BOOK NAME ");
        String name = sc.nextLine();

        AddressBook book = addressBooks.get(name);

        if (book == null) {
            System.out.println("ADDRESS BOOK NOT FOUND ");
            return;
        }

        book.menu();
    }

    // STREAM
    public void listAddressBooks()
    {
        if (addressBooks.isEmpty())
        {
            System.out.println("NO ADDRESS BOOKS AVAILABLE");
            return;
        }

        System.out.println("AVAILABLE ADDRESS BOOKS");
        addressBooks.keySet()
                .stream()
                .forEach(b -> System.out.println(" - " + b));
        System.out.println();
    }

    public void mainMenu()
    {
        int choice;
        do {
            System.out.println("ADDRESS BOOK SYSTEM");
            System.out.println("1. CREATE ADDRESS BOOK");
            System.out.println("2. OPEN ADDRESS BOOK");
            System.out.println("3. LIST ADDRESS BOOKS");
            System.out.println("4. EXIT");
            System.out.print("ENTER CHOICE");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> addNewAddressBook();
                case 2 -> openAddressBook();
                case 3 -> listAddressBooks();
                case 4 -> System.out.println("SYSTEM CLOSED");
                default -> System.out.println("INVALID CHOICE");
            }
        } while (choice != 4);
    }

    public static void main(String[] args)
    {
        new AddressBookSystem().mainMenu();
    }
}

