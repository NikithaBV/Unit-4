package contactbook;
/**
 *
 * @author Nikitha B V
 */
public class ContactBookDemo
{
    public static void main(String[] args)
    {
        ContactBook contactbook = new ContactBook();
        ContactBean contact1 = new ContactBean("Nikitha","9745211875","nikitha5@gmail.com");
        ContactBean contact2 = new ContactBean("Alice","9985133276","alice@gmail.com");
        contactbook.addContact(contact1);
        contactbook.addContact(contact2);
        System.out.println("Contact list:");
        for (ContactBean contact : contactbook.listContacts())
        {
            System.out.println(contact);
        }
        System.out.println("Removing contact with name 'Nikitha'");
        contactbook.removeContact("Nikitha");
        System.out.println("Updated contact list:");
        for (ContactBean contact : contactbook.listContacts())
        {
            System.out.println(contact);
        }
    }
}