package advancedClassDesign._6six;

import java.util.List;
import java.util.function.Predicate;

public class Duck {

    private String name;
    private List<Duck> ducklings;

    public Duck(String name, List<Duck> ducklings) {
        this.name = name;
        this.ducklings = ducklings;
    }

    public String getName() {
        return name;
    }

    public List<Duck> getDucklings() {
        return ducklings;
    }

    public String hasDucklings(Predicate<Duck> p) {
        return p.test(this) ? "Duck Duck" : "";
    }
}
