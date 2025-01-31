/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paymentgatewaysystem;
/**
 *
 * @author Nikitha B V
 */
import java.io.Serializable;

public class UserBean implements Serializable {
    private String userId;
    private String userName;
    private String email;
    private String contactNumber;

    public UserBean() {}

    public UserBean(String userId, String userName, String email, String contactNumber) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    // Getters and Setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
}
