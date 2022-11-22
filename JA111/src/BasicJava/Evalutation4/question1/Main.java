package BasicJava.Evalutation4.question1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter 1 to Add product");
            System.out.println("Enter 2 to for exit");
            System.out.println("---------------------------------------------------------");
            System.out.println("Enter your choice");
            int x = sc.nextInt();
            if(x==1){
                System.out.println("Enter Product name");
                String prductName = sc.next();
                System.out.println("Enter Product price");
                double productPric = sc.nextDouble();
                productList.add(new Product(prductName,productPric));
                if(productList.size() == 4){
                    System.out.println("Product add succesful");
                    break;
                }
            }
            else {
                System.out.println("Thank you for using our application");
                break;
            }
        }
        System.out.println(productList);
    }
}
