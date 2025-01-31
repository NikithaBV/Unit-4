/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coffeeordersystem;

/**
 *
 * @author Nikitha B V
 */
// Base Coffee Interface
interface Coffee {
    String getDescription(); // Description of the coffee
    double getCost();        // Cost of the coffee
}
class BasicCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Basic Coffee";
    }

    @Override
    public double getCost() {
        return 50.0; // Base price of coffee
    }
}

// Abstract Decorator Class
abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee; // Composition - Coffee object to be decorated

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}

// Milk Decorator
class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 10.0; // Cost of milk
    }
}

// Sugar Decorator
class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 5.0; // Cost of sugar
    }
}

// Flavor Shot Decorator
class FlavorShotDecorator extends CoffeeDecorator {
    private String flavor;

    public FlavorShotDecorator(Coffee coffee, String flavor) {
        super(coffee);
        this.flavor = flavor;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", " + flavor + " Flavor Shot";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 15.0; // Cost of a flavor shot
    }
}

public class CoffeeOrderSystem {

   public static void main(String[] args) {
        // Step 1: Start with a basic coffee
        Coffee coffee = new BasicCoffee();
        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Total Cost: " + coffee.getCost() + "\n");

        // Step 2: Add milk
        coffee = new MilkDecorator(coffee);
        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Total Cost: " + coffee.getCost() + "\n");

        // Step 3: Add sugar
        coffee = new SugarDecorator(coffee);
        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Total Cost: " + coffee.getCost() + "\n");

        // Step 4: Add a vanilla flavor shot
        coffee = new FlavorShotDecorator(coffee, "Vanilla");
        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Total Cost: " + coffee.getCost() + "\n");

        // Step 5: Add another flavor shot (e.g., Hazelnut)
        coffee = new FlavorShotDecorator(coffee, "Hazelnut");
        System.out.println("Order: " + coffee.getDescription());
        System.out.println("Total Cost: " + coffee.getCost());
    }
    
}
