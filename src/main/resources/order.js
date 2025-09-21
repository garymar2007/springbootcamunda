var System = Java.type('java.lang.System');

var orderItems = [
    { name: "Laptop", price: 1000 },
    { name: "Mouse", price: 20 },
    { name: "Keyboard", price: 50 }
];

var totalAmount = 0;
for (var i = 0; i < orderItems.length; i++) {
    totalAmount += orderItems[i].price;
}

if (totalAmount > 1000) {
    totalAmount *= 0.9;  // 10% discount
}

execution.setVariable("orderTotal", totalAmount);

System.out.println("Order total calculated: $" + totalAmount);