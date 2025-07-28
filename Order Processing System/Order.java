import java.util.ArrayList;
import java.util.List;

public class Order {
    
    private int orderID;
    private String orderDate;
    private ArrayList<Products> products;
    private OrderStatus status;
    private double totalAmount;


    Order(int orderID, String orderDate, List <Products> products){
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.products = new ArrayList<>();
        this.status = OrderStatus.PENDING;
       
    }

    public double calculateTotal(){
        return totalAmount;
    }

    public void addProduct(Products productName){
        products.add(productName);
    }

    public void removeProduct(Products productName){
        products.remove(productName);
    }

    public void setOrderStatus(OrderStatus status){
        this.status = status;
    }
    
}

