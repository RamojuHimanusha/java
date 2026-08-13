package javaprograms;

class Customer {
    String name;
    String location;

    void sendOrder() {
        System.out.println(name + " sent the order.");
    }

    void receiveOrder() {
        System.out.println(name + " received the order.");
    }
}

class Order {
    String date;
    String number;

    void confirm() {
        System.out.println("Order confirmed.");
    }

    void close() {
        System.out.println("Order closed.");
    }
}

class SpecialOrder extends Order {

    void dispatch() {
        System.out.println("Special order dispatched.");
    }
}

class NormalOrder extends Order {

    void dispatch() {
        System.out.println("Normal order dispatched.");
    }

    void receive() {
        System.out.println("Normal order received.");
    }
}

public class CustomerAndReceiver {
    public static void main(String[] args) {

        Customer c = new Customer();
        c.name = "priya";
        c.location = "Visakhapatnam";

        SpecialOrder so = new SpecialOrder();
        so.date = "25-01-2023";
        so.number = "S103";

        NormalOrder no = new NormalOrder();
        no.date = "18-07-2025";
        no.number = "N102";

        System.out.println("Customer: " + c.name);
        System.out.println("Location: " + c.location);
        c.sendOrder();

        System.out.println("Special Order");
        System.out.println("Date: " + so.date);
        System.out.println("Number: " + so.number);
        so.confirm();
        so.close();
        so.dispatch();

        System.out.println("Normal Order");
        System.out.println("Date: " + no.date);
        System.out.println("Number: " + no.number);
        no.confirm();
        no.close();
        no.dispatch();
        no.receive();

        c.receiveOrder();
    }
}
/*
Priya - Visakhapatnam
Priya sent the order.
Special Order: S103
Order confirmed.
Order closed.
Special order dispatched.
Normal Order: N102
Order confirmed.
Order closed.
Normal order dispatched.
Normal order received.
Priya received the order.*/
