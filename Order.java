import java.util.ArrayList;
    
// Here we're creating a new data type called Order
public class Order {
    
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value false
    private ArrayList<Item> items; // defaults to null
    
    // CONSTRUCTOR
    // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order(){
        this.name = "Guest";
        this.ready = false;
        this.items = new ArrayList();
    }
    // OVERLOADED CONSTRUCTOR
    // Takes a name as an argument, sets name to this custom name.
    // Initializes items as an empty list.
    public Order(String name){
        this.name = name;
        this.ready = false;
        this.items = new ArrayList();
    }
    
    // GETTERS & SETTERS
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setReady(boolean is_ready){
        this.ready = is_ready;
    }

    public boolean getReady(){
        return this.ready;
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public ArrayList<Item> getItems(){
        return this.items;
    }

    //Order Methods
    public String getStatusMessage(){
        if(this.ready){
            return "Your order is ready!";
        }
        else{
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal(){
        double sum = 0.0;
        for(Item item : this.items){
            sum = sum + item.getPrice();
        }
        return sum;
    }
    
    public void display(){
        System.out.printf("Customer Name: %s \n", this.name);
        for(Item item : this.items){
            System.out.printf("%s - %.2f \n", item.getName(), item.getPrice());
        }
        System.out.printf("Total: %.2f\n", this.getOrderTotal());
        System.out.println(this.getStatusMessage());
    }
    
}


