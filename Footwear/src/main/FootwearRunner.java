package main;
import entity.Footwear;
import logic.GoShopping;
import creator.CreateFootwear;

public class FootwearRunner {
    public static void main(String [] args) {
        CreateFootwear creator = new CreateFootwear();
        creator.makeFootware();
    }
}
