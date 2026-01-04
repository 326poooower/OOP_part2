package task5;

public class Building {
    private String type;

    public void initialize(String type) {
        this.type = type;
        System.out.println(this.type);
    }

    public static void main(String[] args) {
        Building building = new Building();
        building.initialize("Restaurant");
        building.initialize("Barbershop");
    }
}