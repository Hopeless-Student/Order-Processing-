import java.util.ArrayList;

public class Inventory {
    ArrayList<Products> productsStorage;

    Inventory(){
        productsStorage = new ArrayList<>();
    }

    public void addToInventory(Products productName){
        productsStorage.add(productName);
    }

    public void updateProductStock(int productID, int quantity){
        
    }

    public void checkAvailability(int productID, int quantity){
        
    }

    public void availableProducts(){
        int i = 1;
        System.out.println("\n\t\t\t\tAvailable Products:");
        for (Products products : productsStorage) {
            System.out.println("\t\t\t\t["+i+"] " + products.getProductID() + ": " + products.getProductName() + " -- $" + products.getPricePerUnit());
            i++;
        }
    }

    public boolean checkOrder(int orderID){
        boolean found = false;
        for (Products products : productsStorage) {
            if(orderID == products.getProductID()){
                found = true;
                return true;
            } 
        }

        if(found) System.out.println("Happy shopping!");
        else System.out.println("No such item!"); return false;
    }
}
