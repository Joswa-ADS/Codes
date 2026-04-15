class OutOfStockException extends Exception{
    public OutOfStockException(String msg){
        super(msg);
    }
}
class PaymentFailedException extends Exception{
    public PaymentFailedException(String msg){
        super(msg);
    }
}
class OrderFailedException extends Exception{
    public OrderFailedException(String msg){
        super(msg);
    }
}
class Product{
    String name;
    int stock;
    int price;
    public Product(String name, int stock, int price){
        this.name = name;
        this.stock = stock;
        this.price = price;
    }
}
class User{
    String name;
    int balance;
    public User(String name, int balance){
        this.name = name;
        this.balance = balance;
    }
}
class Order{
    Product product;
    User user;
    int stock;
    public Order(Product product,User user,int stock){
        this.product = product;
        this.user = user;
        this.stock = stock;
    }
}

public class task{
    public static void main(String[] args){
        Product p = new Product("Laptop", 10, 50000);
        User u = new User("John", 100000);
        Order o = new Order(p, u, 12);
        try{
            if(o.product.stock < o.stock){
                throw new OutOfStockException("Out of Stock");
            }
            if(o.user.balance < o.product.price * o.stock){
                throw new PaymentFailedException("Payment Failed");
            }
            o.product.stock -= o.stock;
            o.user.balance -= o.product.price * o.stock;
            System.out.println("Order Placed Successfully");
        }
        catch(OutOfStockException e){
            System.out.println(e.getMessage());
        }
        catch(PaymentFailedException e){
            System.out.println(e.getMessage());
        }
    }
}