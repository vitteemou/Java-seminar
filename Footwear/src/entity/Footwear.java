package entity;
public enum Footwear {
    FLATS, SLIPPERS, BOOTS, SNEAKERS;

    private int size;
    private boolean heel;
    private String material;
    private double price;

    Footwear() {
    }

    public String[] supplementImage() {
        String footwearName = this.name();
        switch (this) {
            case FLATS:
                String [] image1 = {footwearName, "blouse", "skirt"};
                return image1;
            case SLIPPERS:
                String [] image2 = {footwearName, "pyjamas"};
                return image2;
            case BOOTS:
                String [] image3 = {footwearName, "coat", "trousers", "cap"};
                return image3;
            case SNEAKERS:
                String [] image4 = {footwearName, "jeans", "t-shirt"};
                return image4;
            default:
                throw new EnumConstantNotPresentException(this.getDeclaringClass(), this.name());
        }
    }

    public double defineSeasonalDiscount() {
        switch (this) {
            case FLATS:
                return (this.price*0.2);
            case BOOTS:
                return (this.price*0.1);
            default:
                return 0.0;
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isHeel() {
        return heel;
    }

    public void setHeel(boolean heel) {
        this.heel = heel;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return getClass().getName() + ", " + Integer.toString(getSize()) + ", " + getMaterial() + ", " + Double.toString(getPrice());
    }
}
