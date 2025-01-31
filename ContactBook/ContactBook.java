package contactbook;
/**
 *
 * @author Nikitha B V
 */
import java.util.*;
public class ContactBook
{
    private List<ContactBean> contacts;
    public ContactBook()
    {
        contacts = new ArrayList<>();
    }
    public void addContact(ContactBean contact)
    {
        contacts.add(contact);
    }
    public void removeContact(String name)
    {
        contacts.removeIf(contact -> contact.getName().equals(name));
    }
    public List<ContactBean> listContacts()
    {
        return new ArrayList<>(contacts);
    }
}