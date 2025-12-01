package addressbook;

import java.util.ArrayList;

public class AddressBook
{
    private ArrayList<ContactPerson> con=new ArrayList<>();

    public void addContactPerson(String firstName, String lastName, String address,
                                 String city, String state, String zip,
                                 String phoneNumber, String email)
    {
        ContactPerson newContact = new ContactPerson(firstName, lastName, address, city, state, zip, phoneNumber, email);
        con.add(newContact);
        System.out.println(firstName + " : added successfully");
    }


    public boolean editContact(String firstName,String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {

        for(ContactPerson contact : con)
        {
            if(contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName))
            {
                contact.setAddress(address);
                contact.setCity(city);
                contact.setState(state);
                contact.setZip(zip);
                contact.setPhoneNumber(phoneNumber);
                contact.setEmail(email);
                System.out.println("CANTACT EDITED SUCCESSFULLY");
                return true;
            }
        }
        System.out.println("CANTACT NOT FOUND");
        return false;
    }

    public boolean deleteContact(String firstName,String lastName)
    {
       return con.removeIf(person->person.getFirstName().equalsIgnoreCase(firstName) &&
               person.getLastName().equalsIgnoreCase(lastName));
    }

    public void displayContact()
    {
        if(con.isEmpty())
        {
            System.out.println("no contacts");
        }

        for(ContactPerson cons : con)
        {
            System.out.println(cons);
        }
    }

    public static void main(String[] args)
    {
        AddressBook add=new AddressBook();
        add.addContactPerson("prabhu","N","mettupatty","dindigul","tamilnadu",
                                                   "624001","8610011389","prabu@gmail.com");
        add.displayContact();

        add.editContact("prabhu","N","chinnaiyapuram","madurai","kerala",
                                 "896004","9898989898","jhgfg");
        add.displayContact();
        AddressBook add2=new AddressBook();
        add2.addContactPerson("vinoth","developer","tambaram","chennai",
                                  "tamilnadu","624118","98765432","vino@gmail.com");
        add2.deleteContact("vinoth","developer");
    }


}
