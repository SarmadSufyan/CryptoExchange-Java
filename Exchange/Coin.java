package Exchange ;

import java.util.Random;
import java.util.Scanner;

// Sab sy pehly Coin k liye class bna rahy hn taky jin ko hum as a object add karingy
public class Coin {
    
 private String name;
    private double minPrice;
    private double maxPrice;

    public Coin(String name, int minPrice, int maxPrice) {
        this.name = name;
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }
    
    public String getName() {
            return name;
        }

    public double getMinPrice() {
        return minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }
    
}