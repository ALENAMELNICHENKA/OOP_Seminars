package HW;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        
        HotDrinkTemp hotDrink1 = new HotDrinkTemp("Чай", 200, 70);
        HotDrinkTemp hotDrink2 = new HotDrinkTemp("Кофе", 150, 80);
        HotDrinkTemp hotDrink3 = new HotDrinkTemp("Какао", 250, 90);
       
        Set<HotDrinkTemp> hotdrinks = new HashSet<>(Arrays.asList(hotDrink1, hotDrink2, hotDrink3)); 
//Распечатаем:
       for (HotDrinkTemp drink : hotdrinks) {
        System.out.println(drink);
       }
        
       



       


    
    }
}
