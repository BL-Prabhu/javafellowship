package addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook implements  ContactRepository
{
    private final List<ContactPerson> contacts = new ArrayList<>();

    @Override
    public void add(ContactPerson contact) {
        contacts.add(contact);
    }

    @Override
    public boolean update(ContactPerson updatedContact) {
        for (ContactPerson contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(updatedContact.getFirstName())
                    && contact.getLastName().equalsIgnoreCase(updatedContact.getLastName())) {

                contact.setAddress(updatedContact.getAddress());
                contact.setCity(updatedContact.getCity());
                contact.setState(updatedContact.getState());
                contact.setZip(updatedContact.getZip());
                contact.setPhoneNumber(updatedContact.getPhoneNumber());
                contact.setEmail(updatedContact.getEmail());
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(String firstName, String lastName) {
        return contacts.removeIf(c ->
                c.getFirstName().equalsIgnoreCase(firstName)
                        && c.getLastName().equalsIgnoreCase(lastName));
    }

    @Override
    public List<ContactPerson> findAll() {
        return contacts;
    }
}
