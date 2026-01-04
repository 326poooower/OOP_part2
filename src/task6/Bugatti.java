package task6;

public class Bugatti {
    private String color = "BLACK";
    private int year = 2020;
    private String body = "Coupe";

    public Bugatti() {
    }

    public String getBody() {
        //System.out.println(body);

        return body;
    }

    public void setBody(String body) {
        this.body = body;

        System.out.println(this.body);
    }

    public static void main(String[] args) {
        Bugatti bugatti = new Bugatti();
        bugatti.getBody();
        bugatti.setBody("Convertible");
    }
}

