package addressbook.dao;

import addressbook.model.Contact;

public interface ContactDAO
{
    public void insertOperation(Contact contact);
    public void fetchOperation();
   // public void updateOperation(int id, String phone);
   // public void deleteOperation(int id);
}
