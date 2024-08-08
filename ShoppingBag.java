import java.util.HashMap;
import java.util.Map;

public class ShoppingBag {
    private Map<Product, Integer> items = new HashMap<>();

    public void addProduct(Product product, int quantity) {
        items.put(product, items.getOrDefault(product, 0) + quantity);
    }

    public void removeProduct(Product product) {
        items.remove(product);
    }

    public Map<Product, Integer> getItems() {
        return items;
    }

    public double getTotalCost() {
        double totalCost = 0.0;

        for(Map.Entry<Product, Integer> entry: items.entrySet()){
            Product product = entry.getKey();
            int quantity = entry.getValue();
            totalCost += product.getPrice() * quantity;
        }

        return totalCost;
    }
}
