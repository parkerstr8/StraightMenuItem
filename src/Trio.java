public class Trio implements MenuItem
{
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;
}
    public Trio(Sandwich sandwich, Salad salad, Drink drink) {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
        getName()
        {
            return this.sandwich.getName() + "/" + this.salad.getName+"/"
                    +this.drink.getName+"Trio";
        }
        getPrice()
        {
            int x=this.sandwich.getPrice();
            int y=this.salad.getPrice();
            int z=this.drink.getPrice();
        }

    }

