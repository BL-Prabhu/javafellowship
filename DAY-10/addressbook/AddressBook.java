package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    private ArrayList<ContactPerson> contacts = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);


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

    public void menu()
    {
        int choice;

        do {
            System.out.println("==== Address Book Menu ====");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Edit Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
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
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.\n");
            }
        } while (choice != 5);
    }

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        addressBook.menu();
    }
}
