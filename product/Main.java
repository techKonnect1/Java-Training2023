public class Main {
    public static void main(String[] args) {
    Product product = new Product("chain", 50.00);
    Service service = new Service( "shipping", 10.00);
        System.out.println("Product: " + product.getName() + ", Price: $" + product.getPrice());
        System.out.println("Service: " + service.getServiceName() + ", Price: $" + service.getServiceRate());
    }
}

