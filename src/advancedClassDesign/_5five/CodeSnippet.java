package advancedClassDesign._5five;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class CodeSnippet {

    List<Integer> source = new ArrayList<>(Arrays.asList(1,2,3,4));
    List<Integer> fish = new CopyOnWriteArrayList<>(source);
//    List<Integer> mammals = Collections.synchronizedList(source);
//    Set<Integer> birds = new ConcurrentSkipListSet<>();
//    birds.addAll(source);
//
//    synchronized (new Integer(10)) {
//        for (Integer f : fish) fish.add(4); // c1
//        for (Integer m : mammals) mammals.add(4); // c2
//        for (Integer b : birds) birds.add(4); // c3
//
//        System.out.print(fish.size() + " " + mammals.size() + " " + birds.size());
//    }
}
