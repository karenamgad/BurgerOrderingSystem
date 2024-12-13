/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package burgerrestaurantsystem;



/**
 *
 * @author Karen Amgad
 */
public class Item {
    private String size="MEDIUM";
    private double price;
    private String name;
    private String type;

    public Item(String name, String type, double price) {
        this.price = price;
        this.name = name.toUpperCase();
        this.type = type.toUpperCase();
    }

    public double getBasePrice() {
        return price;
    }

    public String getName() {
        if (type.equals("SIDE")|| type.equals("DRINK"))
        { return size + " " + name; }
        return name;
    }

    public void setSize(String size) {
        this.size = size;
    }
    

  public double getAdjustedPrice() {
        return switch (size) {
            case "SMALL" -> getBasePrice() - 0.5;
            case "LARGE" -> getBasePrice() + 1;
            default -> getBasePrice();
        };
    }
  
  public static void printItem(String name, double price) {
        System.out.printf("%20s:%6.2f%n", name, price);
    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }

    
   
    
    
    
    
    
    
    
}
