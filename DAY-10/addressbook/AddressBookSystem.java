package addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookSystem {

    private Map<String, AddressBook> addressBooks = new HashMap<>();
    private Scanner sc = new Scanner(System.in);


    public void addNewAddressBook()
    {
        System.out.print("ENTER NEW ADDRESS BOOK NAME ");
        String name = sc.nextLine();

        if (addressBooks.containsKey(name)) {
            System.out.println("ADDRESS BOOK'" + name + "' ALREADY EXISTS");
            return;
        }

        addressBooks.put(name, new AddressBook());
        System.out.println("ADDRESS BOOK : '" + name + "' CREATED SUCCESSFULLY");
    }


    public void openAddressBook()
    {
        System.out.print("ENTER ADDRESS BOOK NAME TO OPEN");
        String name = sc.nextLine();

        AddressBook selected = addressBooks.get(name);

        if (selected == null)
        {
            System.out.println("NO ADDRESS BOOK FOUND WITH THAT NAME");
            return;
        }

        System.out.println("OPENING ADDRESS BOOK : " + name);
        selected.menu();
    }


    public void listAddressBooks()
    {
        if (addressBooks.isEmpty())
        {
            System.out.println("NO ADDRESS BOOKS AVAILABLE");
            return;
        }

        System.out.println(" AVAILABLE ADDRESS BOOKS : ");
        for (String name : addressBooks.keySet())
        {
            System.out.println(" - " + name);
        }
        System.out.println();
    }


    public void mainMenu()
    {
        int choice;

        do
        {
            System.out.println("ADDRESS BOOK SYSTEM MENU");
            System.out.println("1. CREATE NEW ADDRESS BOOK");
            System.out.println("2. OPEN EXISTING ADDRESS BOOK");
            System.out.println("3. LIST ALL ADDRESS BOOKS");
            System.out.println("4. EXIT SYSTEM");
            System.out.print("ENTER YOUR CHOICE");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice)
            {
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
                    System.out.println("EXISTING SYSTEM");
                    break;

                default:
                    System.out.println("INVALID CHOICE TRY AGAIN");
            }

        }
        while (choice != 4);
    }

    public static void main(String[] args)
    {
        AddressBookSystem system = new AddressBookSystem();
        system.mainMenu();
    }
}
