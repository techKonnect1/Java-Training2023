public class Service implements Purchasable {
    public String serviceName;
    public double serviceRate;

    public Service(String serviceName, double serviceRate) {
        this.serviceName = serviceName;
        this.serviceRate = serviceRate;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getServiceRate() {
        return serviceRate;
    }

    public double getPrice() {
        return serviceRate;
    }
}





//public class Product implements Purchasable {
  //  public String name;
    //public double price;

    //public Product(String name, double price) {
      //  this.name = name;
        //this.price = price;
    //}

    //@Override
    //public double getPrice() {
      //  return price;
    //}

    //public String getName() {
      //  return name;
    //}
//}

