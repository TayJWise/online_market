public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    // Constructor for Product class
    public Product(int id, String name, double price, int quantity){
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

    // Setters
    public void setId() {
        this.id = id;
    }

    public void setName(){
        this.name = name;
    }

    public void setPrice(){
        this.price = price;
    }

    public void setQuantity(){
        this.quantity = quantity;
    }

}


