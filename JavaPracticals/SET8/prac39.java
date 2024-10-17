import java.util.Arrays;

class Product implements Comparable<Product> {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {
        return this.price - other.price;
    }

    @Override
    public String toString() {
        return name + ": $" + price;
    }
}
public class prac39 {
    public static <T extends Comparable<T>> void sortArray(T[] array) {
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        Integer[] numbers = { 8, 3, 19, 13, 7 ,2};
        System.out.println("Before sorting (Integers): " + Arrays.toString(numbers));
        sortArray(numbers);
        System.out.println("After sorting (Integers): " + Arrays.toString(numbers));
        String[] names = { "Cristiano", "Alice", "Marco", "Messi" };
        System.out.println("\nBefore sorting (Strings): " + Arrays.toString(names));
        sortArray(names);
        System.out.println("After sorting (Strings): " + Arrays.toString(names));
        Product[] products = {
                new Product("Laptop", 700),
                new Product("Phone", 550),
                new Product("Tablet", 540),
                new Product("Smartwatch", 200)
        };
        System.out.println("\nBefore sorting (Products by price): ");
        for (Product p : products) {
            System.out.println(p);
        }
        sortArray(products);
        System.out.println("\nAfter sorting (Products by price): ");
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("23DCS083_MARK");
    }
}


