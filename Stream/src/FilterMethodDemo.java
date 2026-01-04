import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    private int id;
    private String productName;
    private float price;

    public Product(int id, String productName, float price) {
        super();
        this.id = id;
        this.productName = productName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}


public class FilterMethodDemo {

    public static void main(String[] args) {

        //Traditional way

        List<Product> list = new ArrayList<Product>();

        for(Product product: getProducts()){
            if(product.getPrice() > 25000f){
                list.add(product);
            }
        }

        System.out.println("Printing Productlist who has price >25000 using Traditional way");
        for (Product product : list){
            System.out.println(product);
        }
        //Using stream
        System.out.println("Printing Productlist who has price >25000 using Stream....");
        getProducts().stream().filter((product -> product.getPrice()>25000f))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

    private static List<Product> getProducts(){
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1, "HP",25000f));
        productList.add(new Product(2, "DELL",28000f));
        productList.add(new Product(3, "Lenovo",50000f));
        productList.add(new Product(4, "Apple",100000f));
        return productList;
    }
}
