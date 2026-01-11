package addressbook;

import java.util.List;

public class ContactPrinter
{
    public void print(List<ContactPerson> contacts) {
        if (contacts.isEmpty()) {
            System.out.println("No contacts");
            return;
        }
        contacts.forEach(System.out::println);
    }
}
