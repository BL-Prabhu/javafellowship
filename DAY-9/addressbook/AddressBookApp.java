package addressbook;

public class AddressBookApp
{
    public static void main(String[] args)
    {

        ContactRepository repository = new AddressBook();
        ContactPrinter printer = new ContactPrinter();

        ContactPerson person1 = new ContactPerson("prabhu", "N", "mettupatty", "dindigul", "tamilnadu", "624001", "8610011389", "prabu@gmail.com");

        repository.add(person1);
        printer.print(repository.findAll());

        ContactPerson updatedPerson = new ContactPerson("vinoth", "t", "chinnaiyapuram", "madurai", "kerala", "896004", "9898989898", "jhgfg");

        repository.update(updatedPerson);
        printer.print(repository.findAll());

        repository.delete("prabhu", "N");
        printer.print(repository.findAll());
    }
}
