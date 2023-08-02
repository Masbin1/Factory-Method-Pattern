public class Main {
    public static void main(String[] args) {
        ProductFactory productFactory = new ConcreteProductFactory();

        // Create Laptop using Factory Method
        Product laptop = productFactory.createProduct("Laptop");
        System.out.println("Product: " + laptop.getProductName());

        // Create Smartphone using Factory Method
        Product smartphone = productFactory.createProduct("Smartphone");
        System.out.println("Product: " + smartphone.getProductName());
    }
}
