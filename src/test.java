import java.util.ArrayList;
import java.util.List;

public class test {



    public static void main(String[] args) {
        Parent parent1 = new Parent();
        Son son = new Son();

        son = (Son) parent1;

        List<Parent> p = new ArrayList<>();
        p.add(parent1);
        for (Parent parent : p) {
            System.out.println(parent);
        }

    }

}
