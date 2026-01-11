package addressbook;

import java.util.List;

public interface ContactRepository
{
    void add(ContactPerson contact);
    boolean update(ContactPerson contact);
    boolean delete(String firstName, String lastName);
    List<ContactPerson> findAll();
}
