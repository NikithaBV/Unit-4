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

public class PaymentBean implements Serializable {
    private String paymentMethod;
    private double amount;
    private String currency;

    public PaymentBean() {}

    public PaymentBean(String paymentMethod, double amount, String currency) {
        this.paymentMethod = paymentMethod;
        this.amount = amount;
        this.currency = currency;
    }

    // Getters and Setters
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
