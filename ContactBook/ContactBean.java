package contactbook;
/**
 *
 * @author Nikitha B V
 */
import java.io.Serializable;
public class ContactBean implements Serializable
{
    private String name, phno, email;
    public ContactBean(String name, String phoneNumber, String email) {
        this.name = name;
        this.phno = phoneNumber;
        this.email = email;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getPhno()
    {
        return phno;
    }
    public void setPhno(String phno)
    {
        this.phno = phno;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    @Override
    public String toString()
    {
        return " Name: " + name + "\n Phone Number: " + phno + "\n Email: " + email;
    }
}