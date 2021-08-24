package advancedClassDesign._18eighteenth;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<? extends  RuntimeException> set = new HashSet<>();
//        Set<? extends  RuntimeException> set1 = new HashSet<? extends  RuntimeException>();
//        Set<? extends  RuntimeException> set2 = new HashSet<Exception>();
        Set<? extends  RuntimeException> set3 = new TreeSet<RuntimeException>();
        Set<? extends  RuntimeException> set4 = new HashSet<NullPointerException>();
    }

}
