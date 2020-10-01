public class Customer
{
    private static int maxId;

    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double intitalCashOnHand)
    {
        maxId++;
        id = maxId;

        this.name = name;
        this.cashOnHand = intitalCashOnHand;
    }

    public int getId()
    {
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void addCash(double cash)
    {
        cashOnHand += cash;
    }

    public double getCash()
    {
        return cashOnHand;
    }
    public void buySnacks(double costOfSnacks)
    {
        cashOnHand -= costOfSnacks;
    }
}