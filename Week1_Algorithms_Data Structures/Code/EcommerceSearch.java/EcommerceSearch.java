import java.util.*;

class Product implements Comparable<Product> {
    private final int id;
    private final String name;
    private final String category;

    public Product(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public int compareTo(Product other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Product [ID=" + id + ", Name=" + name + ", Category=" + category + "]";
    }
}
class SearchManager {

    public static Product linearSearch(List<Product> list, String name) {
        for (Product product : list) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }
    public static Product binarySearch(List<Product> list, String name) {
        int low = 0, high = list.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = list.get(mid).getName().compareToIgnoreCase(name);

            if (cmp == 0) return list.get(mid);
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return null;
    }
}

public class EcommerceSearch {
    public static void main(String[] args) {
        List<Product> productList = Arrays.asList(
            new Product(101, "iPhone 14", "Electronics"),
            new Product(102, "MacBook Pro", "Electronics"),
            new Product(103, "Galaxy S22", "Electronics"),
            new Product(104, "Pixel 7", "Electronics")
        );

        System.out.println(" Linear Search Result:");
        Product foundLinear = SearchManager.linearSearch(productList, "MacBook Pro");
        System.out.println(foundLinear != null ? foundLinear : "Product not found");

        System.out.println("\n Binary Search Result:");
        
        List<Product> sortedList = new ArrayList<>(productList);
        Collections.sort(sortedList);

        Product foundBinary = SearchManager.binarySearch(sortedList, "MacBook Pro");
        System.out.println(foundBinary != null ? foundBinary : "Product not found");
    }
}