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
    private String pizzaName;
    private String ingredients;
    private int calories;
    private double price;
}
