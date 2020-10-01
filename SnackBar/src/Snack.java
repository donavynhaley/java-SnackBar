public class Snack
{
    private static int maxId = 0;

    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    // Constructor method
    public Snack(String name, int quantity, double cost, int vendingMachineId)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }
    // Getters and setters
    /*
    get id
    set and get name
    set and get cost
    set and get vending machine id
    get quantity
    add quantity when given how many to add
    buy snack when given how many to buy
    get total cost given a quantity
    */

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getCost()
    {
        return cost;
    }

    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public int getVendingMachineId()
    {
        return vendingMachineId;
    }

    public void setVendingMachineId(int vendingMachineId)
    {
        this.vendingMachineId = vendingMachineId;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void addQuantity(int quantityToAdd)
    {
        this.quantity += quantityToAdd;
    }

    public void buySnack(int quantity)
    {
        System.out.println("you purchased a snack");
    }
    public double getTotalCost(int quantity)
    {
        this.quantity -= quantity;
        return cost * quantity;
    }

}