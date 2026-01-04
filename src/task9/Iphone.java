package task9;

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Iphone)) {
            return false;
        }

        Iphone iphone = (Iphone) obj;

        if (price != iphone.price) {
            return false;
        }
        if (model == null) {
            if (iphone.model != null) return false;
        } else if (!model.equals(iphone.model)) {
            return false;
        }
        if (color == null) {
            return iphone.color == null;
        } else {
            return color.equals(iphone.color);
        }
    }

    //
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);
        System.out.println(iphone1.equals(iphone2));

        //System.out.println(iphone1.equals(null));
    }
}