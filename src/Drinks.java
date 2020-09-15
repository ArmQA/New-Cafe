import java.util.ArrayList;

public class Drinks {


    static ArrayList<Drink> Drink = new ArrayList<>();

    public static void getOrder() {
        Drink.add(new Drink("Fanta", 1));
        Drink.add(new Drink("Cola", 2));
        Drink.add(new Drink("Cognac", 3));
        Drink.add(new Drink("Coffee", 4));
        Drink.add(new Drink("Carbonated Water", 5));
        Drink.add(new Drink("Cocktail Margarita", 6));
        System.out.println(Drink);
    }

    public static void main(String[] args) {
        getOrder();
        System.out.println(Drink.get(0).Name);
    }
}


