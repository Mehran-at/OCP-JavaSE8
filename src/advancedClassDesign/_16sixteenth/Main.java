package advancedClassDesign._16sixteenth;

import java.time.Duration;
import java.time.Period;

public class Main {

    public static void main(String[] args) {
        String d = Duration.ofDays(1).toString();
        String p = Period.ofDays(1).toString();

        boolean b1 = d == p;
        boolean b2 = d.equals(p);
        System.out.println(b1 + " " + b2);
        System.out.println(d);
        System.out.println(p);
    }
}
