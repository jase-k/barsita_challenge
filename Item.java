public class Item {
    
    // MEMBER VARIABLES
    private String name;
    private double price;
    
    // CONSTRUCTOR
    public Item(){
        this.name = "default";
        this.price = 0.0;
    }
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }
    //   Takes a name and price as arguments 
    //   and sets them accordingly
    
    // GETTERS & SETTERS  - for name and price
    public double getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }
}
