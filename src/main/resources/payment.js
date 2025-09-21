var System = Java.type('java.lang.System');

var orderId = execution.getVariable("orderId");
var orderTotal = execution.getVariable("orderTotal");

var paymentSuccessful = (Math.random() < 0.8);  // 80% chance of success

if (paymentSuccessful) {
    System.out.println("Payment of $" + orderTotal + " processed successfully for Order Id: " + orderId + ".");
    execution.setVariable("paymentStatus", "SUCCESS");
} else {
    System.out.println("Payment of $" + orderTotal + " failed for Order Id: " + orderId + ". Please try again.");
    execution.setVariable("paymentStatus", "FAILED");
}