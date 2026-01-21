package addressbook.service;

import addressbook.dao.ContactDAO;
import addressbook.dao.ContactDAOImpl;
import addressbook.model.Contact;

public class ContactServiceImpl implements ContactService
{
    private final ContactDAO contactDao=new ContactDAOImpl();

    @Override
    public void addContact(Contact contact)
    {
        if(contact.getPhoneNumber().length() !=10)
        {
            throw new RuntimeException("INVALID PHONE NUMBER ");
        }
        contactDao.insertOperation(contact);
        System.out.println("CONTACT ADDED SUCCESSFULLY");
    }

    @Override
    public void viewContact()
    {
        contactDao.fetchOperation();
    }
}
