import java.util.Locale;

class TestDrive {
    public static void main(String[] args) {
        Pizza simpleVeganPizza = new Vegan();
        System.out.println(simpleVeganPizza.getDescription() + " $" + formatSum(simpleVeganPizza.cost()));

        Pizza veganPizzaDecor = new Vegan();
        veganPizzaDecor = new Broccoli(new Pizza() {
            @Override
            double cost() {
                return 4.99;
            }
        });
        veganPizzaDecor = new Tomato(new Broccoli(new Pizza() {
            @Override
            double cost() {
                return 0;
            }
        }));
        veganPizzaDecor = new Spinach(new Tomato());
        System.out.println(veganPizzaDecor.getDescription() + " $" + formatSum(veganPizzaDecor.cost()));

        Pizza meatPizzaDecor = new MeatHeaven();
        meatPizzaDecor = new Ham(new Chicken());
        meatPizzaDecor = new Chicken(/* write your code here */);
        meatPizzaDecor = new Cheese(/* write your code here */);
        System.out.println(meatPizzaDecor.getDescription() + " $" + formatSum(meatPizzaDecor.cost()));

    }

    private static String formatSum(double sum) {
        return String.format(Locale.ROOT, "%.2f", sum);
    }
}

abstract class Pizza {
    String description;

    String getDescription() {
        return description;
    }

    abstract double cost();
}

class Vegan extends Pizza {

    Vegan() {
        description = "Vegan";
    }

    @Override
    double cost() {
        return 4.99;
    }
}

class MeatHeaven extends Pizza {

    MeatHeaven() {
        description = "MeatHeaven";
    }

    @Override
    double cost() {
        return 4.0;
    }
}

abstract class Decorator extends Pizza {
    abstract String getDescription();
}

class Ham extends Decorator {
    private Pizza pizza;

    Ham(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Ham";
    }

    @Override
    double cost() {
        return 1.0 + pizza.cost();
    }
}

class Chicken extends Decorator {

    private Pizza pizza;

    Chicken(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Chicken";
    }

    @Override
    double cost() {
        return 1.5 + pizza.cost();
    }
}

class Cheese extends Decorator {

    private Pizza pizza;

    Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    double cost() {
        return .20 + pizza.cost();
    }
}

class Broccoli extends Decorator {

    private Pizza pizza;

    Broccoli(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Broccoli";
    }

    @Override
    double cost() {
        return .10 + pizza.cost();
    }
}

class Tomato extends Decorator {

    private Pizza pizza;

    Tomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Tomato";
    }

    @Override
    double cost() {
        return .09 + pizza.cost();
    }
}

class Spinach extends Decorator {

    private Pizza pizza;

    Spinach(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Spinach";
    }

    @Override
    double cost() {
        return .09 + pizza.cost();
    }
}