package BasicJava.Evalutation4.question1;

public class Product implements Comparable<Product> {
    String productName;
    double productPrice;

    public Product() {
    }

    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }
    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName +
                ", productPrice=" + productPrice +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if(this.productPrice == o.productPrice){
            return 0;
        }
        if (this.productPrice < o.productPrice){
            return 1;
        }
        else return -1;

    }
}
