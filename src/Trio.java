public class Trio implements MenuItem {
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;

    public Trio(Sandwich sandwich, Salad salad, Drink drink) {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }
       public String getName()
        {
         return this.sandwich.getName() + "/" + this.salad.getName() + "/" + this.drink.getName() + " Trio";
        }
        public double getPrice()
        {
            double x = this.sandwich.getPrice();
            double y = this.salad.getPrice();
            double z = this.drink.getPrice();

            if(x<=y && x<=z) {
                return y + z;
            }
            if (x>=z)
            {
                return x+y;
            }
            return x+z;

        }


}
