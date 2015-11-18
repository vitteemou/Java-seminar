package creator;
import entity.Footwear;
import logic.GoShopping;

public class CreateFootwear {
    public void makeFootware() {
        Footwear footwear1 = Footwear.FLATS;
        footwear1.setPrice(55.5);
        footwear1.setSize(38);
        double discount = footwear1.defineSeasonalDiscount();

        Footwear footwear2 = Footwear.SNEAKERS;
        footwear2.setSize(38);
        String[] sneakersImage = footwear2.supplementImage();

        GoShopping shopping = new GoShopping();
        String[] info = new String[10];
        info = shopping.findInformationBySize(38);
    }

}
