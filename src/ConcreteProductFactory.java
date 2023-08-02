public class ConcreteProductFactory extends ProductFactory {
    @Override
    public Product createProduct(String productType) {
        if (productType.equals("Laptop")) {
            return new Laptop();
        } else if (productType.equals("Smartphone")) {
            return new Smartphone();
        }
        return null;
    }
}
