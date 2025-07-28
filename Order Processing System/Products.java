public class Products {
    
    private int productID;
    private String productName;
    private double pricePerUnit;
    private int quantity;

    Products(int productID, String productName, double pricePerUnit, int quantity){
        this.productID = productID;
        this.productName = productName;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
    }

    public int getProductID(){
        return productID;
    }

    public String getProductName(){
        return productName;
    }

    public double getPricePerUnit(){
        return pricePerUnit;
    }

    public int getQuantity(){
        return quantity;
    }

    public void updateAndSetQuantity(int updatedQuantity){
        this.quantity = updatedQuantity;
    }

    public void displayProductInfo(){
        System.out.println("\n\t\t\t\t*-----Item-----*");
        System.out.println("\t\t\t\tProduct ID  : " + productID);
        System.out.println("\t\t\t\tProduct Name: " + productName);
        System.out.println("\t\t\t\tPrice       : " + pricePerUnit);
        System.out.println("\t\t\t\tQuantity    : " + quantity);
    }
    
}
