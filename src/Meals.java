import java.util.ArrayList;

public class Meals {
    static ArrayList<Meal> meals = new ArrayList<>();

    public static void getOrder() {
        meals.add(new Meal("Burger", 1));
        meals.add(new Meal("Pizza", 2));
        meals.add(new Meal("Burrito", 3));
        meals.add(new Meal("Fri", 4));
        meals.add(new Meal("Khinkali", 5));
        meals.add(new Meal("Stake", 6));
        System.out.println(meals);
    }

    public static void main(String[] args) {
        getOrder();
        System.out.println(meals.get(0).Name);
}
}
