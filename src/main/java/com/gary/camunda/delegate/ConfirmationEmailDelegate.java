package com.gary.camunda.delegate;

import org.camunda.bpm.engine.delegate.JavaDelegate;

public class ConfirmationEmailDelegate implements JavaDelegate {
    @Override
    public void execute(org.camunda.bpm.engine.delegate.DelegateExecution execution) throws Exception {
        System.out.println("ConfirmationEmailDelegate invoked");
        // Add logic to send confirmation email
        String orderId = (String) execution.getVariable("orderId");
        System.out.println("Sending confirmation email for order ID: " + orderId);
        // Simulate email sending
        Thread.sleep(1000);
        System.out.println("Confirmation email sent for order ID: " + orderId);
        System.out.println("Sending mail that transaction of order of amount " + execution.getVariable("orderTotal")
                + " is a " + execution.getVariable("paymentStatus"));
    }
}
