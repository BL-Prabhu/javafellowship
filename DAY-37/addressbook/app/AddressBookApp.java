package addressbook.app;

import addressbook.db.DBInitializer;
import addressbook.model.Contact;
import addressbook.service.ContactService;
import addressbook.service.ContactServiceImpl;

import java.util.Scanner;

public class AddressBookApp
{
    public static void main(String[] args) {
        DBInitializer.initialize();

        ContactService service = new ContactServiceImpl();
        Scanner scan = new Scanner(System.in);

        while (true)
        {
            System.out.println(" ADDRESS BOOK");
            System.out.println("-------------------------------------");
            System.out.println("1. ADD CONTACT");
            System.out.println("2. VIEW CONTACTS");
            System.out.println("3. UPDATE CONTACTS");
            System.out.println("4. DELETE CONTACT");
            System.out.println("5. EXIT");

            int choice = scan.nextInt();
            scan.nextLine();

            switch(choice)
            {
                case 1 ->
                {
                    Contact c=new Contact();
                    System.out.println("FIRST NAME : ");
                    c.setFirstName(scan.nextLine());

                    System.out.println("LAST NAME : ");
                    c.setLastName(scan.nextLine());

                    System.out.println("ADDRESS : ");
                    c.setAddress(scan.nextLine());

                    System.out.println("CITY : ");
                    c.setCity(scan.nextLine());

                    System.out.println("STATE : ");
                    c.setState(scan.nextLine());

                    System.out.println("ZIP : ");
                    c.setZip(scan.nextLine());

                    System.out.println("PHONE NUMBER : ");
                    c.setPhoneNumber(scan.nextLine());

                    service.addContact(c);
                }
                case 2 ->
                {
                    service.viewContact();
                }
            }
            }

        }

    }

