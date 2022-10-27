import java.util.Optional;

public class Optional_test {
    public static void main(String[] args) {
//        Optional<Object> o = Optional.of(null);
        Integer q = null;
        Optional<Integer> optional = Optional.ofNullable(q);
        Integer integer = optional.orElse(6);
        System.out.println(integer);
    }
}
