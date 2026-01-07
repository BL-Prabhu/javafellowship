package addressbook;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    private ArrayList<ContactPerson> contacts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private FileIOService fileIOService = new FileIOService();
    private CSVAddressBookService csvService = new CSVAddressBookService();
    private JSONAddressBookService jsonService = new JSONAddressBookService();

    public ArrayList<ContactPerson> getContacts()
    {
        return contacts;
    }

    public void addContactFromConsole()
    {

        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        System.out.print("Enter State: ");
        String state = sc.nextLine();

        System.out.print("Enter Zip: ");
        String zip = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        ContactPerson newContact = new ContactPerson(
                firstName, lastName, address, city, state, zip, phone, email
        );

        contacts.add(newContact);
        System.out.println("\nContact added successfully!\n");
    }

    public void displayContacts()
    {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.\n");
            return;
        }

        System.out.println("---- Contact List ----");
        for (ContactPerson c : contacts) {
            System.out.println(c);
        }
        System.out.println();
    }

    public void editContact()
    {
        System.out.print("Enter First Name to edit: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name to edit: ");
        String lastName = sc.nextLine();

        for (ContactPerson c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(firstName) &&
                    c.getLastName().equalsIgnoreCase(lastName)) {

                System.out.println("Editing contact...");

                System.out.print("New Address: ");
                c.setAddress(sc.nextLine());

                System.out.print("New City: ");
                c.setCity(sc.nextLine());

                System.out.print("New State: ");
                c.setState(sc.nextLine());

                System.out.print("New Zip: ");
                c.setZip(sc.nextLine());

                System.out.print("New Phone Number: ");
                c.setPhoneNumber(sc.nextLine());

                System.out.print("New Email: ");
                c.setEmail(sc.nextLine());

                System.out.println("Contact updated successfully!\n");
                return;
            }
        }

        System.out.println("Contact not found!\n");
    }

    public void deleteContact()
    {
        System.out.print("Enter First Name to delete: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Last Name to delete: ");
        String lastName = sc.nextLine();

        boolean removed = contacts.removeIf(c ->
                c.getFirstName().equalsIgnoreCase(firstName) &&
                        c.getLastName().equalsIgnoreCase(lastName));

        if (removed)
            System.out.println("Contact deleted successfully!\n");
        else
            System.out.println("Contact not found!\n");
    }

    public void sortContactsByName() {

        if (contacts.isEmpty()) {
            System.out.println("No contacts to sort.\n");
            return;
        }

        System.out.println("Sorting contacts alphabetically by name...\n");

        contacts = contacts.stream()
                .sorted(Comparator
                        .comparing(ContactPerson::getFirstName, String.CASE_INSENSITIVE_ORDER)
                        .thenComparing(ContactPerson::getLastName, String.CASE_INSENSITIVE_ORDER))
                .toList()
                .stream()
                .collect(java.util.stream.Collectors.toCollection(ArrayList::new));

        contacts.forEach(System.out::println);
    }

    public void createTextFile() {
        fileIOService.createTextFile();
    }

    public void saveContactsToTextFile() {
        fileIOService.writeContactsToFile(contacts);
    }

    public void readContactsFromTextFile() {
        fileIOService.readContactsFromFile();
    }

    public void createJSON() {
        jsonService.createJSONFile();
    }

    public void saveContactsToJSON() {
        jsonService.writeContactsToJSON(contacts);
    }

    public void readContactsFromJSON() {
        jsonService.readContactsFromJSON();
    }



//    public void menu()
//    {
//        int choice;
//
//        do {
//            System.out.println("==== Address Book Menu ====");
//            System.out.println("1. Add Contact");
//            System.out.println("2. Display Contacts");
//            System.out.println("3. Edit Contact");
//            System.out.println("4. Delete Contact");
//            System.out.println("5. Sort Contacts by Name");
//            System.out.println("6. Exit");
//            System.out.print("Enter your choice: ");
//
//            choice = Integer.parseInt(sc.nextLine());
//
//            switch (choice) {
//                case 1:
//                    addContactFromConsole();
//                    break;
//
//                case 2:
//                    displayContacts();
//                    break;
//
//                case 3:
//                    editContact();
//                    break;
//
//                case 4:
//                    deleteContact();
//                    break;
//
//                case 5:
//                    sortContactsByName();
//                    break;
//
//                case 6:
//                    System.out.println("Exiting...");
//                    break;
//
//                default:
//                    System.out.println("Invalid choice! Try again.\n");
//            }
//        } while (choice != 6);
//    }

    public void menu()
    {
        int choice;

        do {
            System.out.println("==== Address Book Menu ====");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Sort Contacts by Name");
            System.out.println("6. Create Text File");
            System.out.println("7. Save Contact to Text File");
            System.out.println("8. Read Contacts from Text File");
            System.out.println("9. Create CSV File");
            System.out.println("10. Save Contacts to CSV");
            System.out.println("11. Read Contacts from CSV");
            System.out.println("12. Create JSON File");
            System.out.println("13. Save Contacts to JSON");
            System.out.println("14. Read Contacts from JSON");
            System.out.println("15. Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addContactFromConsole();
                    break;

                case 2:
                    displayContacts();
                    break;

                case 3:
                    editContact();
                    break;

                case 4:
                    deleteContact();
                    break;

                case 5:
                    sortContactsByName();
                    break;


                case 6:
                    createTextFile();
                    break;

                case 7:
                    saveContactsToTextFile();
                    break;
                case 8 :
                    readContactsFromTextFile();
                    break;

                case 9:
                    createCSV();
                    break;
                case 10 :
                    saveContactsToCSV();
                    break;
                case 11 :
                    readContactsFromCSV();
                    break;

                case 12:
                    createJSON();
                    break;

                case 13:
                    saveContactsToJSON();
                    break;

                case 14:
                    readContactsFromJSON();
                    break;


                case 15 :
                    System.out.println("Exiting...");
                    break;


                default:
                    System.out.println("Invalid choice! Try again.\n");
            }
        } while (choice != 12);
    }

    public void createCSV() {
        csvService.createCSVFile();
    }

    public void saveContactsToCSV() {
        csvService.writeContactsToCSV(contacts);
    }

    public void readContactsFromCSV() {
        csvService.readContactsFromCSV();
    }



    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.menu();
    }
}
