package addressbook;

import java.util.ArrayList;
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
            System.out.println("4. Search Person by City");
            System.out.println("5. Search Person by State");
            System.out.println("6. Exit System");

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
                    searchPersonByCity();
                    break;

                case 5:
                    searchPersonByState();
                    break;

                case 6:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("INVALID CHOICE TRY AGAIN");
            }

        }
        while (choice != 6);
    }

    private Map<String, AddressBook> addressBook = new HashMap<>();

    // City → Persons
    private Map<String, ArrayList<ContactPerson>> cityPersonMap = new HashMap<>();

    // State → Persons
    private Map<String, ArrayList<ContactPerson>> statePersonMap = new HashMap<>();

    private void buildCityAndStateMaps()
    {

        cityPersonMap.clear();
        statePersonMap.clear();

        addressBooks.values().stream()
                .flatMap(book -> book.getContacts().stream())
                .forEach(person -> {

                    cityPersonMap
                            .computeIfAbsent(person.getCity(), k -> new ArrayList<>())
                            .add(person);

                    statePersonMap
                            .computeIfAbsent(person.getState(), k -> new ArrayList<>())
                            .add(person);
                });
    }

    public void searchPersonByCity() {

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        buildCityAndStateMaps();

        var persons = cityPersonMap.get(city);

        if (persons == null || persons.isEmpty()) {
            System.out.println("No persons found in city: " + city);
            return;
        }

        System.out.println("Persons in city: " + city);
        persons.forEach(System.out::println);
    }


    public void searchPersonByState() {

        System.out.print("Enter State: ");
        String state = sc.nextLine();

        buildCityAndStateMaps();

        var persons = statePersonMap.get(state);

        if (persons == null || persons.isEmpty()) {
            System.out.println("No persons found in state: " + state);
            return;
        }

        System.out.println("Persons in state: " + state);
        persons.forEach(System.out::println);
    }


    public static void main(String[] args)
    {
        AddressBookSystem system = new AddressBookSystem();
        system.mainMenu();
    }
}
