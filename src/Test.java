import java.security.KeyPair;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {

        Box<String> box = new Box<>("roleks");
        String fromBox = box.getFromBox();
        System.out.println(fromBox);

        Person person = new Person("Andrzej", "Golota");
        Box<Person> room = new Box<>(person);
        Person someone = room.getFromBox();
        System.out.println(someone);
    }

    private static Optional<Double> divide(double a, double b) {
        if (b == 0.0) {
            return Optional.empty();
        } else {
            return Optional.of(a / b);
        }
    }
}

