// Imports
import java.util.*;

public class Inventory {
    
    // Attributes of the Inventory class
    private ArrayList<Item> inventory;
    private String inventoryName;
    private String inventoryDescription;

    // Constructors getter and setters and ToString

    public Inventory() {
    }

    public Inventory(ArrayList<Item> inventory, String inventoryDescription, String inventoryName) {
        this.inventory = inventory;
        this.inventoryDescription = inventoryDescription;
        this.inventoryName = inventoryName;
    }

    public Inventory(String inventoryDescription, String inventoryName) {
        this.inventoryDescription = inventoryDescription;
        this.inventoryName = inventoryName;
    }

    

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public String getInventoryName() {
        return inventoryName;
    }

    public void setInventoryName(String inventoryName) {
        this.inventoryName = inventoryName;
    }

    public String getInventoryDescription() {
        return inventoryDescription;
    }

    public void setInventoryDescription(String inventoryDescription) {
        this.inventoryDescription = inventoryDescription;
    }

    @Override
    public String toString() {
        return "Inventory [inventory=" + inventory + ", inventoryName=" + inventoryName + ", inventoryDescription="
                + inventoryDescription + "]";
    }

    
}
