public class Customer {
    
    private int customerID;
    private String customerName;
    private String address;
    private String orderHistory;


    Customer(int customerID, String customerName, String address){
        this.customerID = customerID;
        this.customerName = customerName;
        this.address = address;
    }

    public void placeOrder(Order order){

    }

    public void getOrderHistory(){
        
    }
}
