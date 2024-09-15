package com.Payment;

public class PayPalPayment implements PaymentMethod{
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " using PayPal account " + email + "...");
    }
}
