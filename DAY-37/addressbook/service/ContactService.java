package addressbook.service;

import addressbook.model.Contact;

public interface ContactService
{
    public void addContact(Contact contact);
    public void viewContact();
    public void updateContact(int id, Contact contact);
   // public void deleteContact(int id);
}
