package m06.s14;

public class Main {
    public static void main(String[] args) {
        Dog tom = new Dog("Tom");

        String name = tom.getName();
        double speed = tom.getSpeed();

        // it is just a copy, the change here has no effect on original value
        speed += 3;

        System.out.println("Local name and speed: " + name + ", " + speed);
        System.out.println(tom);
    }
}
