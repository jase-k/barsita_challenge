import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // // Menu items
        Item item1 = new Item("mocha", 4.5);
        Item item2 = new Item("latte", 6.5);
        Item item3 = new Item("drip coffee", 2.5);
        Item item4 = new Item("capuccino", 7.5);

        Order order1 = new Order();
        order1.addItem(item1);
        order1.addItem(item2);
        Order order2 = new Order();
        order2.addItem(item2);
        order2.addItem(item3);
        Order order3 = new Order("Jimmy");
        order3.addItem(item3);
        order3.addItem(item4);
        Order order4 = new Order("Sarah");
        order4.addItem(item4);
        order4.addItem(item1);
        Order order5 = new Order("Beth");
        order5.addItem(item1);
        order5.addItem(item3);
    
    
        order1.setReady(true);
        order2.setReady(true);

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();
        // // Application Simulations
        // // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // order1.items.add(item2);
        // System.out.println(order1.items);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
        // order2.items.add(item1);
        // order2.total = item1.price;
        // System.out.printf("%s's Total: $%.2f\n", order2.name, order2.total);

        // order3.items.add(item4);
        // order3.total = item4.price;

        // order4.items.add(item2);
        // order4.total = item2.price;

        // order1.ready = true;

        // order4.items.add(item2);
        // order4.total = order4.total + item2.price;
        // order4.items.add(item2);
        // order4.total = order4.total + item2.price; 

        // order2.ready = true;

        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
        
        // System.out.printf("Name: %s\n", order2.name);
        // System.out.printf("Total: %s\n", order2.total);
        // System.out.printf("Ready: %s\n", order2.ready);
        
        // System.out.printf("Name: %s\n", order3.name);
        // System.out.printf("Total: %s\n", order3.total);
        // System.out.printf("Ready: %s\n", order3.ready);
        
        // System.out.printf("Name: %s\n", order4.name);
        // System.out.printf("Total: %s\n", order4.total);
        // System.out.printf("Ready: %s\n", order4.ready);
    }
}
