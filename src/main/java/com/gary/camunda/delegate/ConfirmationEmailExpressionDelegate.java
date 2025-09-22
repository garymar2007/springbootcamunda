package com.gary.camunda.delegate;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class ConfirmationEmailExpressionDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
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
