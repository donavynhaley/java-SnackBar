public class Main
{

    public static void main(String[] args)
    {
        System.out.println("test");

        // Customers
        Customer jane = new Customer("Jane", 45.2f);
        Customer bob = new Customer("Bob", 33.14f);

        // vending Machines
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        // Snacks
        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());

        /*Processing*/
        jane.buySnacks(soda.getTotalCost(3));
        System.out.println(jane.getCash());
        System.out.println(soda.getQuantity());

        jane.buySnacks(pretzel.getTotalCost(1));
        System.out.println(jane.getCash());
        System.out.println(pretzel.getQuantity());

        bob.buySnacks(soda.getTotalCost(2));
        System.out.println(bob.getCash());
        System.out.println(soda.getQuantity());

        jane.addCash(10f);
        System.out.println(jane.getCash());

        jane.buySnacks(chocolateBar.getTotalCost(1));
        System.out.println(jane.getCash());
        System.out.println(chocolateBar.getQuantity());

        pretzel.addQuantity(12);
        System.out.println(pretzel.getQuantity());

        bob.buySnacks(pretzel.getTotalCost(3));
        System.out.println(bob.getCash());
        System.out.println(pretzel.getQuantity());
    }
}