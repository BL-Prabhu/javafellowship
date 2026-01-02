package addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook
{
    private ArrayList<ContactPerson> contacts=new ArrayList<>();
    private Scanner sc=new Scanner(System.in);

    public void addContact()
    {
        System.out.print("ENTER FIRST NAME : ");
        System.out.println("---------------------");
        String firstName = sc.nextLine();

        System.out.print("ENTER LAST NAME : ");
        System.out.println("---------------------");
        String lastName = sc.nextLine();

        System.out.print("ENTER ADDRESS : ");
        System.out.println("---------------------");
        String address = sc.nextLine();

        System.out.print("ENTER CITY : ");
        System.out.println("---------------------");
        String city = sc.nextLine();

        System.out.print("ENTER STATE : ");
        System.out.println("---------------------");
        String state = sc.nextLine();

        System.out.print("ENTER PINCODE : ");
        System.out.println("---------------------");
        String zip = sc.nextLine();

        System.out.print("ENTER PHONE NUMBER : ");
        System.out.println("---------------------");
        String phone = sc.nextLine();

        System.out.print("ENTER EMAIL : ");
        System.out.println("---------------------");
        String email = sc.nextLine();

        contacts.add(new ContactPerson(
                firstName, lastName, address, city, state, zip, phone, email));

        System.out.println("CONTACT ADDED SUCCESSFULLY......");
    }

    public void displayContacts()
    {
        if (contacts.isEmpty())
        {
            System.out.println("NO CONTACTS FOUND");
            return;
        }

        System.out.println("---- CONTACT LIST  ----");
        System.out.println("------------------------");
        contacts.stream()
                .forEach(System.out::println);
        System.out.println();
    }

    public void editContact()
    {
        System.out.print("ENTER FIRST NAME TO EDIT ");
        System.out.println("-------------------------");
        String firstName = sc.nextLine();

        System.out.print("ENTER LAST NAME TO EDIT ");
        System.out.println("-------------------------");
        String lastName = sc.nextLine();

        contacts.stream()
                .filter(c -> c.getFirstName().equalsIgnoreCase(firstName)
                        && c.getLastName().equalsIgnoreCase(lastName))
                .findFirst()
                .ifPresentOrElse(c ->
                {

                    System.out.print("NEW ADDRESS");
                    System.out.println("-------------------------");
                    c.setAddress(sc.nextLine());

                    System.out.print("NEW CITY ");
                    System.out.println("-------------------------");
                    c.setCity(sc.nextLine());

                    System.out.print("NEW STATE ");
                    System.out.println("-------------------------");
                    c.setState(sc.nextLine());

                    System.out.print("NEW PINCODE ");
                    System.out.println("-------------------------");
                    c.setZip(sc.nextLine());

                    System.out.print("NEW PHONE NUMBER ");
                    System.out.println("-------------------------");
                    c.setPhoneNumber(sc.nextLine());

                    System.out.print("NEW EMAIL ");
                    System.out.println("-------------------------");
                    c.setEmail(sc.nextLine());

                    System.out.println("CONTACT UPDATED SUCCESSFULLY");

                }, () -> System.out.println("CONTACT NOT FOUND"));
    }

    public void deleteContact()
    {
        System.out.print("ENTER FIRST NAME TO DELETE ");
        System.out.println("--------------------------");
        String firstName = sc.nextLine();

        System.out.print("ENTER LAST NAME TO DELETE");
        System.out.println("----------------------------");
        String lastName = sc.nextLine();

        contacts.stream()
                .filter(c -> c.getFirstName().equalsIgnoreCase(firstName)
                        && c.getLastName().equalsIgnoreCase(lastName))
                .findFirst()
                .ifPresentOrElse(c -> {
                    contacts.remove(c);
                    System.out.println("CONTACT DELETED SUCCESSFULLY");
                }, () -> System.out.println("CONTACT NOT FOUND"));
    }

    public void menu()
    {
        int choice;
        do {
            System.out.println("ADDRESS BOOK MENU");
            System.out.println("----------------------");
            System.out.println("1. ADD CONTACT");
            System.out.println("2. DISPLAY CONTACTS");
            System.out.println("3. EDIT CONTACT");
            System.out.println("4. DELETE CONTACT");
            System.out.println("5. EXIT");
            System.out.print("ENTER CHOICE");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1 -> addContact();
                case 2 -> displayContacts();
                case 3 -> editContact();
                case 4 -> deleteContact();
                case 5 -> System.out.println("EXITING...");
                default -> System.out.println("INVALID CHOICE");
            }
        } while (choice != 5);
    }
}
