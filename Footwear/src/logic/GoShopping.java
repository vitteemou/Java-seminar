package logic;
import entity.Footwear;

public class GoShopping {
    public String[] findInformationBySize(int size) {
        Footwear[] footwear = Footwear.values();
        String [] information = new String[100];

        int j = 0;
        for (Footwear element : footwear) {
            if(element.getSize() == size) {
                information[j] = element.toString();
                j++;
            }
        }
        return information;
    }
}
