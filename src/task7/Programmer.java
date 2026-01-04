package task7;

public class Programmer {
    private int salary = 1000;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > this.salary) {
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        System.out.println(programmer.getSalary());
        programmer.setSalary(900);
        System.out.println(programmer.getSalary());
        programmer.setSalary(1500);
        System.out.println(programmer.getSalary());
    }
}