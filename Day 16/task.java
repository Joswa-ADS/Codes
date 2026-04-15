import java.util.*;

class Product{
    String name;
    int price;
    double rating;
    Product(String name,int price,double rating){
        this.name=name;
        this.price=price;
        this.rating=rating;
    }
    @Override
    public String toString(){
        return this.name+" : "+this.price+" - "+this.rating;
    }
}
public class Task1 {
    public static void main(String[] args) {
        List<Product> prdts=new ArrayList<>();
        prdts.add(new Product("Bottle", 100, 4.5));
        prdts.add(new Product("Bag", 500, 4.0));
        prdts.add(new Product("Shoes", 1500, 4.8));
        Comparator<Product> byprice=new Comparator<Product>() {
            public int compare(Product p1, Product p2){
                return p1.price - p2.price; 
            }
        };
        Collections.sort(prdts, byprice);
        System.out.println("By price: "+prdts);

        Comparator<Product> byrating=new Comparator<Product>() {
            public int compare(Product p1, Product p2){
                return Double.compare(p2.rating, p1.rating); 
            }
        };
        Collections.sort(prdts, byrating);
        System.out.println("By rating: "+prdts);

        Comparator<Product> byname=new Comparator<Product>() {
            public int compare(Product p1, Product p2){
                return p1.name.compareTo(p2.name); 
            }
        };
        Collections.sort(prdts, byname);
        System.out.println("By name: "+prdts);
    }
}