package cristinapalmisani.U2W1L1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Pizzas {
    private String pizzaName = "Pizza Margherita";
    private String ingredients = "tomato, cheese";
    private int calories = 1104 ;
    private double price = 4.99;
}
