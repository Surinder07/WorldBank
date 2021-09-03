package practice.streams;

import java.util.List;

public class Dish {

    private String dishName;
    private int calories;
    private List<String> ingredients;
    private Dishtype dishtype;


    public Dish(String dishName, int calories, List<String> ingredients, Dishtype dishtype) {
        this.dishName = dishName;
        this.calories = calories;
        this.ingredients = ingredients;
        this.dishtype = dishtype;
    }

    public String getDishName() {
        return dishName;
    }

    public int getCalories() {
        return calories;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public Dishtype getDishtype() {
        return dishtype;
    }
}
